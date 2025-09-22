class calculator {
    public int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}


public class PolymorphismExample {
    public static void main (String[] args) {
        calculator calc = new calculator();
        int result1 = calc.add(10, 20);
        System.out.println("Sum of two numbers: " + result1);
        int result2 = calc.add(10, 20, 30);
        System.out.println("Sum of three numbers: " + result2); 
    }

}