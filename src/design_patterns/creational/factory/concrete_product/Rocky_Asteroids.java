package design_patterns.creational.factory.concrete_product;

import design_patterns.creational.factory.product.Asteroids;

public class Rocky_Asteroids implements Asteroids {
    @Override
    public void show() {
        System.out.println("Rocky_Asteroids popped up");
    }
}
