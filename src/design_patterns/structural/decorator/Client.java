package design_patterns.structural.decorator;

import design_patterns.structural.decorator.component.Pizza;
import design_patterns.structural.decorator.component.PlainPizza;
import design_patterns.structural.decorator.decorator.contrete_decorator.CheeseDecorator;
import design_patterns.structural.decorator.decorator.contrete_decorator.PepperoniDecorator;

public class Client {
    public static void main(String[] args) {
        // Create a plain pizza
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Add cheese to the pizza using a decorator
        Pizza pizzaWithCheese = new CheeseDecorator(pizza);
        System.out.println(pizzaWithCheese.getDescription() + " Cost: $" + pizzaWithCheese.getCost());

        // Add pepperoni to the pizza using a decorator
        Pizza pizzaWithCheeseAndPepperoni = new PepperoniDecorator(pizzaWithCheese);
        System.out.println(pizzaWithCheeseAndPepperoni.getDescription() + " Cost: $" + pizzaWithCheeseAndPepperoni.getCost());
    }
}
