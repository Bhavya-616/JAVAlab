// class calculator {
//     public int add(int a, int b) {
//         return a + b;
//     }
//     float add(float a, float b) {
//         return a + b;
//     }
// }

// public class PolymopEx2 {
// public static void main (String[] args) {
//         calculator calc = new calculator();
//         int result1 = calc.add(10, 20);
//         System.out.println("Sum of two numbers: " + result1);
//         float result2 = calc.add(10.5f, 20.5f);
//         System.out.println("Sum of three numbers: " + result2); 
//     }

// }
    

class calculator {
    public float add(int a, float b) {
        return a + b;
    }
    float add(float a, int b, int c) {
        return a + b + c;
    }
}

public class PolymopEx2 {
public static void main (String[] args) {
        calculator calc = new calculator();
        float result1 = calc.add(10, 20.5f);
        System.out.println("Sum of two numbers: " + result1);
        float result2 = calc.add(10.5f, 20, 30);
        System.out.println("Sum of three numbers: " + result2); 
    }

}
    

