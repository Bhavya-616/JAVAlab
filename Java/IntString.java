class calculator {
    public int add(int a, int b) {
        return a + b;
    }
   String add(String a, String b) {
        return a + b;
    }
}

public class IntString {
public static void main (String[] args) {
        calculator calc = new calculator();
        int result1 = calc.add(10, 20);
        System.out.println("Sum of two numbers: " + result1);
        String result2 = calc.add("Hello, ", "World!");
        System.out.println( result2); 
    }

}
    

