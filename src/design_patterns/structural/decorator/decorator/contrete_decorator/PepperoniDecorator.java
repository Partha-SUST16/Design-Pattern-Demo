package design_patterns.structural.decorator.decorator.contrete_decorator;

import design_patterns.structural.decorator.component.Pizza;
import design_patterns.structural.decorator.decorator.PizzaDecorator;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
