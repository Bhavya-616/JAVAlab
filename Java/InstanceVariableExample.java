// public class InstanceVariableExample {
//     // Declare instance variables
//     private int age;
//     private String name;
//     protected String grade;

//     //constructor to initialize instance variables
//     public InstanceVariableExample(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }  
//     //  grade has default value null
// }

// Example2
public class InstanceVariableExample {
    // instance variable
    int instanceVariable;

    // constructor to initialize the instance variable
    public InstanceVariableExample(int value){
        this.instanceVariable = value;
    }

    // methods to display the value of the instance vvariable
    public void displayValue(){
        System.out.println("Instance Variable Values: "+ instanceVariable);
    }

    public static void main(String[] args){
        InstanceVariableExample example = new InstanceVariableExample(106);
        example.displayValue();
    }
}