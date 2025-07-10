public class ModelLap {
    String brand="Dell";
    int ram=12;
    boolean isLAPtouchscreen=true;

    public static void main(String[]args){
        ModelLap mylaptop = new ModelLap();

        System.out.println("Brand: " + mylaptop.brand);
        System.out.println("Ram: " + mylaptop.ram);
        System.out.println("Is Laptop Touch Screen: " + mylaptop.isLAPtouchscreen);
    }

    
}
