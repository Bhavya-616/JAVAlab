public class constructor1 {
    String name;
    int rollnumber;

    public constructor1(String a, int b){ // constructor
        this.name = a;
        this.rollnumber = b;
        System.out.println("My name is " + a + " and my roll number is " + b);

    }
    public static void main (String[] args){
        constructor1 obj = new constructor1("Eren Yeager", 101);
        
    }

        
    
}
