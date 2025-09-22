import java.util.Scanner;

public class Newexam2{
    public static void main(String[] args){
        System.out.println("Enter the Input");
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();

    char c = ch.charAt(0);
    if( c=='a' || c =='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
        System.out.println("This is a Vowel");
    }else{
        System.out.println("This is a Consonant");
    } 
}
}