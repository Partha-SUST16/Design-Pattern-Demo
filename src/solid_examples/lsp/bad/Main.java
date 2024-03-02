package solid_examples.lsp.bad;

import java.util.ArrayList;
import java.util.List;

class Bird {

    public void eat() {
        System.out.println("I can eat.");
    }

    public void fly() {
        System.out.println("I can fly.");
    }
}

class Swan extends Bird {

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
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Help! I cannot fly!");
    }
}

public class Main {
    public static void letBirdsFly(List<Bird> birds) {
        for(Bird bird: birds) {
            bird.fly();
            // bad fix
//            if(!(bird instanceof Penguin)) {
//                bird.fly();
//            }
        }
    }

    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<Bird>();
        birds.add(new Swan());
        birds.add(new Penguin());
        letBirdsFly(birds);
    }
}
