// public class Example10 {
//     public static void main(String[] args) {
//         String original = "banana";
//         String replaced = original.replace('a', 'o');
//         System.out.println(replaced);
//     }
// }

// public class Example10 {
//     public static void main(String[] args) {
//         String text = "      Naruto Uzumaki      ";
//         int length_before =text.length();
//         System.out.println(text.trim());

//         int length_after = text.trim().length();
//         System.out.println("Before trim: "+length_before);
//         System.out.println("After trim: "+length_after);
//     }
// }

// class Example10 {
//     public static void main(String[] args) {
//         String text= "Naruto";
//         char firstchar = text.charAt(0);
//         char lastchar = text.charAt(text.length() -1);

//         System.out.println("Name: "+ text);
//         System.out.println("First character: "+ firstchar);
//         System.out.println("Last character: "+ lastchar);
//     }  
//}

// class Example10{
//     public static void main(String[] args){
//         String sentence = "Eren Yeager was the best man around";
//         String substring = "Yeager";

//         boolean contains = sentence.contains(substring);
//         int index = sentence.indexOf(substring);

//         System.out.println("Sentence:"+ sentence);
//         System.out.println("Contains 'programming': "+ contains);
//         System.out.println("Index of 'programming': "+ index);
//     }
// }

class Example10{
    public static void main(String[]args){
        String text = " I love Sakura";
        String replace=text.replace("Sakura", "Hinata");

        System.out.println("Original: "+ text);
        System.out.println("Replaced: "+ replace);
    }
}