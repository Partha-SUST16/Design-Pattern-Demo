package design_patterns.structural.decorator.decorator.contrete_decorator;

import design_patterns.structural.decorator.component.Pizza;
import design_patterns.structural.decorator.decorator.PizzaDecorator;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
