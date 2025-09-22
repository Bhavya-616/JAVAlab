// public class Example1 {
//     public static void main(String[]args){
//         String greeting = "Hello, World!";
//         System.out.println(greeting);
//     }
    
// }
public class Example1 {
    public static void main(String[] args) {
        String str = "Naruto Uzumaki!";

        
        System.out.println("Using for loop:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        
        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < str.length()) {
            System.out.println(str.charAt(i));
            i++;
        }
    }
}
