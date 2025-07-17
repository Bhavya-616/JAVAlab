
//     public static void main(String[] args) {
//         String filename = "document.pdf";

//         boolean startsWithDoc = filename.startsWith("doc");
//         boolean endsWithPdf = filename.endsWith(".pdf");

//         System.out.println("Filename: "+filename);
//         System.out.println("Starts with 'doc': "+startsWithDoc);
//         System.out.println("Ends with '.pdf': "+endsWithPdf);
        

//     }

    
// }
// public class Example20{
//     public static void main(String[] args) {
//         String text = "Naruto Uzumaki";
//         char[] charArray = text.toCharArray();
//         System.out.println(charArray);
//         System.out.println("Original string: "+ text);
//         System.out.println("Char Array: ");
//         for (char N : charArray) {
//             System.out.println(N + " ");
//         }
//         System.out.println();


//     }
// }

// public class Example20{
//     public static void main(String[] args) {
//         String data = "apple,banana,orange";
//         String[] fruits = data.split(",");
//         System.out.println(fruits);
//         System.out.println("Original: "+ data);
//         System.out.println("Split result: ");
//         for (String F : fruits) {
//             System.out.println("  "+ F);
//         }

//     }
// }

// public class Example20{
//     public static void main(String[] args) {
//         String str1 ="";
//         String str2 ="   ";
//         String str3 ="Dattebayo";
        
//         System.out.println("str1 is empty: "+ str1.isEmpty());
//         System.out.println("str2 is empty: "+ str2.isEmpty());
//         System.out.println("str2 is blank: "+ str2.isBlank());
//         System.out.println("str3 is empty: "+ str3.isEmpty());

//     }
// }
public class Example20{
  public static void main(String[] args) {
    String text = "racecar";
    boolean isPalindrome = checkPalindrome(text);

    System.out.println("'"+ text + "' isPalindrome: " + isPalindrome);
}
public static boolean checkPalindrome(String str){
str = str.toLowerCase();
int left =0;
int right= str.length() -1;

while (left < right){
    if (str.charAt(left) != str.charAt(right)){
        return false;
    }
    left++;
    right--;
}
return true;
}



}
