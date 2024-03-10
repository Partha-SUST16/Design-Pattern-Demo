package design_patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(10,20, 5);
        c1.colour = "Red";

        // Trying to copy c2 into c1
//       Circle c2 = new Circle();
//       c2.x = c1.x;
//       c2.y = c1.y;
//       c2.colour = c1.colour;
//       c2.radius = c1.radius;
        Circle c2 = c1.CLONE();
        c2.draw();
        System.out.println(c1==c2);
    }
}
