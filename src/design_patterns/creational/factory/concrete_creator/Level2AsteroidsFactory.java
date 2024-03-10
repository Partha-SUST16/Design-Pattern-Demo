package design_patterns.creational.factory.concrete_creator;

import design_patterns.creational.factory.concrete_product.Rocky_Asteroids;
import design_patterns.creational.factory.concrete_product.Silicon_Asteroids;
import design_patterns.creational.factory.creator.AsteroidsFactory;
import design_patterns.creational.factory.product.Asteroids;

public class Level2AsteroidsFactory extends AsteroidsFactory {
    @Override
    public Asteroids createAsteroids(int score) {
        if (score > 1000) return new Rocky_Asteroids();
        else return new Silicon_Asteroids();
    }
}
