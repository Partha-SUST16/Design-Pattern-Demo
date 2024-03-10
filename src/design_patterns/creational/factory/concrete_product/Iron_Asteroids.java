package design_patterns.creational.factory.concrete_product;

import design_patterns.creational.factory.product.Asteroids;

public class Iron_Asteroids implements Asteroids {
    @Override
    public void show() {
        System.out.println("Iron_Asteroids popped up");
    }
}
