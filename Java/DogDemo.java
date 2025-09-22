// public class InstanceCar{
//     String model;
//     int year;

//     public static void main(String[]args){
//         InstanceCar car1 = new InstanceCar();
//         car1.model = "Audi A4";
//         car1.year = 2020;

//         InstanceCar car2 = new InstanceCar();
//         car2.model = "BMW X5";
//         car2.year = 2021;

//         System.out.println("Car 1: "+car1.model + ", Year: "+car1.year);
//         System.out.println("Car 2: "+car2.model + ", Year: "+car2.year);
//     } 
// }
class Dog{
    String name= "Buddy";

    void bark(){
        System.out.println(name + " says Woof! Woof! Woof! Woof! ");
    }
}
public class DogDemo{
    public static void main(String[]args){
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog1.bark();
        dog2.name = "Max";
        dog2.bark();
        dog3.name = "Courage";
        dog3.bark();
    }
}