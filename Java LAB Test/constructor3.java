public class constructor3 {
    String name;
    int rollnumber;
    String college;

    public constructor3(String a, int b, String c){ 
        this.name = a;
        this.rollnumber = b;
        this.college = c;
        System.out.println("My name is " + a + " and my roll number is " + b + " and I study in " + c);

    }
    public static void main (String[] args){
        constructor3 obj = new constructor3("Eren Yeager", 101, "Paradise High School");
        constructor3 obj1 = new constructor3("Mikasa Ackerman", 102, "Paradise High School");
        constructor3 obj2 = new constructor3("Armin Arlert", 103, "Paradise High School");
        
    }

        
    
}
