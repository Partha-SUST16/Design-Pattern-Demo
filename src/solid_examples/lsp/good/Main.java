package solid_examples.lsp.good;

import java.util.ArrayList;
import java.util.List;

class Bird {
    public void eat() {
        System.out.println("I can eat.");
    }
}
class FlyingBird extends Bird {
    public void fly() {
        System.out.println("I can fly.");
    }
}
class Swan extends FlyingBird {
    @Override
    public void eat() {
        System.out.println("OMG! I can eat pizza!");
    }
    @Override
    public void fly() {
        System.out.println("I believe I can fly!");
    }
}
class Penguin extends Bird {
    @Override
    public void eat() {
        System.out.println("Can I eat taco?");
    }
}
public class Main {
    public static void letBirdsFly(List<FlyingBird> flyingBirds) {
        for(FlyingBird flyingBird: flyingBirds) {
            flyingBird.fly();
        }
    }
    public static void main(String[] args) {
        List<FlyingBird> flyingBirds = new ArrayList<FlyingBird>();
        flyingBirds.add(new Swan());
        letBirdsFly(flyingBirds);
    }
}
