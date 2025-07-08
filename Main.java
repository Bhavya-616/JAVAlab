import java.util.*;

class Main{
    public static void main(String[]args){
        String name;
        int roll;
        float cgpa;
        double pi_value;

        Scanner io = new Scanner(System.in);

        System.out.println("Enter your name");
        name= io.next();
        System.out.println("Enter your roll number");
        roll= io.nextInt();
        System.out.println("Enter CGPA");
        cgpa= io.nextFloat();
        System.out.println("Enter pi value of maths");
        pi_value= io.nextDouble();

        System.out.println(name);
        System.out.println(roll);
        System.out.println(cgpa);
        System.out.println(pi_value);
    }
}
