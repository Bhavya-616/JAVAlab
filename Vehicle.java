// public class Vehicle {
//     public void run(){
//         System.out.println("Vehicle is running");
//     }

//     public static void main(String[] args) {
//         Vehicle vehicle = new Vehicle();

//         System.out.println("vehicle will start running. ");
//         vehicle.run();
//         System.out.println("This is a vehicle class example. ");
//     }

// }
public class Vehicle {
    String type;
    String color;

    Vehicle(String type, String color){
        this.type = type;
        this.color = color;
    }

        void displayInfo() {
            System.out.println("Vehicle Type: "+ type);
            System.out.println("Vehicle Color: "+ color);
        }
        public static void main(String[] args){
            Vehicle car = new Vehicle("Car", "Red");
            Vehicle bike = new Vehicle("Bike","Blue");
            Vehicle truck = new Vehicle("Truck", "Brown");
            Vehicle jcb = new Vehicle("JCB", "Yellow"); 
        
        car.displayInfo();
        bike.displayInfo();
        truck.displayInfo();
        jcb.displayInfo();
    }

}

// Instance variables
// declared inside thee class, accessing is done through object only.

// static variables
// declared using static keyword, memory alloted once.

// Local 
// decalred within variable, directly accessed.

// public class Vehicle {
//     public void run() {
//         System.out.println("Vehicle is running");
//     }
//     public static void main(String[] args) {
//         System.out.println("Tesla is the best.");
//         Vehicle Tesla = new Vehicle();
//         Person xmen = new Person();
//         Tesla.run();
//         Tesla.start();
//         xmen.drive();

//     }
//       public void start() {
//         System.out.println("Vehicle has started");  
// }
// }
// class Person {
//     void drive() {
//         System.out.println("Person is driving the vehicle");
//     }
// }
