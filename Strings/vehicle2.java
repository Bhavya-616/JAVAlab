public class vehicle2 {
    String type;
    String color;

    vehicle2(String type, String color){
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