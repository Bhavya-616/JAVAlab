import java.util.Locale;

public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return true;
        }

        // Sanitize string: keep Unicode letters/digits and normalize case using Locale.ROOT
        String sanitized = str.codePoints()
                .filter(Character::isLetterOrDigit)
                .collect(StringBuilder::new,
                        (sb, cp) -> sb.appendCodePoint(cp),
                        StringBuilder::append)
                .toString()
                .toLowerCase(Locale.ROOT);

        int left = 0;
        int right = sanitized.length() - 1;

        while (left < right) {
            if (sanitized.charAt(left) != sanitized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
