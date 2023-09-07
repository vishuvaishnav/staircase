// Parent class
class Animal {
    // Method to move
    void move() {
        System.out.println("The animal moves.");
    }
}

// Subclass
class Cheetah extends Animal {
    // Override the move method to make the cheetah run
    @Override
    void move() {
        System.out.println("The cheetah runs at high speed.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal genericAnimal = new Animal();
        // Call the move method of Animal
        genericAnimal.move();
        
        // Create an instance of Cheetah
        Cheetah cheetah = new Cheetah();
        // Call the move method of Cheetah (overrides Animal's move)
        cheetah.move();
    }
}
