package design_patterns.creational.factory.concrete_product;

import design_patterns.creational.factory.product.Asteroids;

public class Silicon_Asteroids implements Asteroids {
    @Override
    public void show() {
        System.out.println("Silicon_Asteroids popped up");
    }
}
