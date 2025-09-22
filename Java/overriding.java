class Animal {
    public void eat() {
        System.out.println("Animals is eating");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
}
public class overriding {
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.eat(); // Outputs "Dog is eating"

        Animal myAnimal = new Animal();
        myAnimal.eat(); // Outputs "Animal is eating"
    }
    
}
