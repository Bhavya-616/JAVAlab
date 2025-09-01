class practice1 {

    float marks = 98.5f; // instance variable (can be accessed by creating object)

    public static void main (String[] args){

        String name = "Eren Yeager"; // local variable (can be accessed directly)
        practice1 obj = new practice1();
        practice1 obj1 = new practice1();
        practice1 obj2 = new practice1();

        System.out.println(obj.marks);
        System.out.println(name);
        
    }
}