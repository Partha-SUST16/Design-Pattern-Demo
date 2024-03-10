package design_patterns.creational.prototype;

// Step 1: Define the Sheep class as the prototype
class Sheep implements Cloneable {
    private String color;
    private double weight;
    private int age;

    public Sheep(String color, double weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public Sheep clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
            return null;
        }
    }

    public void displayInfo() {
        System.out.println("Sheep - Color: " + color + ", Weight: " + weight + ", Age: " + age);
    }
}

public class FarmSimulation {
    public static void main(String[] args) {
        // Step 4: Create an initial sheep
        Sheep originalSheep = new Sheep("White", 50.5, 2);

        // Step 5: Clone the sheep to create a new one
        Sheep clonedSheep = originalSheep.clone();

        // Step 6: Display information about both sheep
        System.out.println("Original Sheep:");
        originalSheep.displayInfo();

        System.out.println("\nCloned Sheep:");
        clonedSheep.displayInfo();
    }
}