// public class Example2 {
//     public static void main(String[] args){
//         String text = "Java";
//         System.out.println(" lenght: "+ text.length());
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