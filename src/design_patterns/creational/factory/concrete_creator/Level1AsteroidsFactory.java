package design_patterns.creational.factory.concrete_creator;

import design_patterns.creational.factory.concrete_product.Ice_Asteroids;
import design_patterns.creational.factory.concrete_product.Iron_Asteroids;
import design_patterns.creational.factory.creator.AsteroidsFactory;
import design_patterns.creational.factory.product.Asteroids;

public class Level1AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Asteroids createAsteroids(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return new Iron_Asteroids();
    }
}
