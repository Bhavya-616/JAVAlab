package AccessDemo;

public class Modifier1 {
    public String name = "John"; 
    public static float testmarks = 82.6f;

    public static void main(String[] args) {

        String company = "XYZ Corp";

        Modifier1 obj = new Modifier1();
        System.out.println(obj.name);
        System.out.println(Modifier1.testmarks);
        System.out.println(company);
    }
    
}
