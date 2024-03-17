package design_patterns.creational.abstract_factory.client;

import design_patterns.creational.abstract_factory.abstract_factory.GuiFactory;
import design_patterns.creational.abstract_factory.product.button.Button;
import design_patterns.creational.abstract_factory.product.checkbox.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GuiFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
