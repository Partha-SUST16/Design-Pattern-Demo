package design_patterns.creational.prototype;

public class Circle {
    public String colour;
    private int x;
    private int y;
    private int radius;

    public Circle() {
    }

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(Circle c) {
        if (c != null) {
            this.x = c.x;
            this.y = c.y;
            this.colour = c.colour;
            this.radius = c.radius;
        }
    }

    void draw() {
        System.out.println("Circle drawn on (" + x + ", " + y + ")" + " with Color: " + colour);
    }

    public Circle CLONE() {
        return new Circle(this);
    }
}
