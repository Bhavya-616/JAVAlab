import java.util.Scanner;

public class Newexam4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter website link here: ");
        String website = scanner.nextLine();
        if(website.startsWith("https")){
            System.out.println("This is a secure website.");
        } else {
            System.out.println("This is not a secure website.");
        }
}

}