package design_patterns.creational.factory;

import design_patterns.creational.factory.concrete_creator.Level1AsteroidsFactory;
import design_patterns.creational.factory.concrete_creator.Level2AsteroidsFactory;
import design_patterns.creational.factory.creator.AsteroidsFactory;
import design_patterns.creational.factory.product.Asteroids;

public class Client {
    public static void main(String[] args) {
        int level = (int)(Math.random() * 2) + 1;

        AsteroidsFactory asteroidsFactory;

        if(level == 1) asteroidsFactory = new Level1AsteroidsFactory();
        else asteroidsFactory = new Level2AsteroidsFactory();

        int score = (int)(Math.random() * 2000);

        Asteroids asteroids = asteroidsFactory.createAsteroids(score);
        asteroids.show();
    }
}
