package design_patterns.creational.factory.creator;

import design_patterns.creational.factory.product.Asteroids;

public abstract class AsteroidsFactory {
    public abstract Asteroids createAsteroids(int score);
}