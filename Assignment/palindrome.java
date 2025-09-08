// public class palindrome {
//     public static void main(String[]args){
//         String str = "madam";
//         String revstr= "";
//         for(int i=str.length()-1;i>=0;i--){
//             revstr = revstr + str.charAt(i);
//         }
//         if(str.equals(revstr)){
//             System.out.println("it is a palindrome");
//         }
//         else{
//             System.out.println("it is not a palindrome");
//         }
//     }
    
// }

// For ignoring the uppercase letters
public class palindrome {
    public static void main(String[]args){
        String str = "Madam";
        String revstr= "";
        for(int i=str.length()-1;i>=0;i--){
            revstr = revstr + str.charAt(i);
        }
        if (str.equalsIgnoreCase(str)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    
    }      
    
}