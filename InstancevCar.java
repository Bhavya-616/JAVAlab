public class InstancevCar{
    String model;
    int year;

    public static void main(String[]args){
        InstancevCar car1 = new InstancevCar();
        car1.model="Audi A4";
        car1.year=2023;

        InstancevCar car2 = new InstancevCar();
        car2.model="Porsche";
        car2.year=2024;

        System.out.println("Car 1 Model: "+car1.model +", Year: "+car1.year );
        System.out.println("Car 2 Model: "+car2.model +", Year: "+car2.year );


    }
}
