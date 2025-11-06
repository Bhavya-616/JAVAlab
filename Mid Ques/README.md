# Java 21 (LTS) Upgrade Notes

This small workspace contains a few Java source files. To upgrade your runtime/tooling to Java 21 (LTS) on Windows, follow the steps below.

## Install Java 21 (Eclipse Temurin / Adoptium recommended)
1. Visit https://adoptium.net/ or https://adoptium.net/releases.html and download the Windows x64 JDK (Temurin) for Java 21.
2. Run the installer or extract the archive to a path such as `C:\jdk-21`.

## Set JAVA_HOME and update PATH (PowerShell)
Run PowerShell as Administrator and set these environment variables:

```powershell
# set for current session
$env:JAVA_HOME = 'C:\jdk-21'
$env:Path = "${env:JAVA_HOME}\bin;${env:Path}"

# to persist for current user (replace with actual install path)
[Environment]::SetEnvironmentVariable('JAVA_HOME','C:\jdk-21','User')
[Environment]::SetEnvironmentVariable('Path', "$((Get-ItemProperty -Path HKCU:\Environment -Name Path -ErrorAction SilentlyContinue).Path);C:\jdk-21\bin",'User')
```

After changing persistent variables, open a new terminal to pick them up.

## Verify installation
```powershell
java -version
javac -version
```

Expected: output mentions `21` (e.g., `openjdk version "21" ...`).

## Compile the project
From the project directory run:

```powershell
javac *.java
```

If compilation fails due to language level, ensure you're using the JDK 21 `javac` on PATH.

## Notes on code changes
- `CheckPalindrome.java` was updated to use a Unicode-aware sanitizer (filters codepoints with `Character.isLetterOrDigit`) and `Locale.ROOT` when lowercasing. This avoids ASCII-only behavior and avoids compiling a regex each call.

## Next steps (optional)
- Run static analysis or unit tests.
- If you use a build tool (Maven/Gradle), update `maven.compiler.release` / `java.toolchain.languageVersion` or `sourceCompatibility`/`targetCompatibility` to 21.