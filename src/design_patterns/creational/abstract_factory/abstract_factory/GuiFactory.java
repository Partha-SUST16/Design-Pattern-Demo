package design_patterns.creational.abstract_factory.abstract_factory;

import design_patterns.creational.abstract_factory.product.button.Button;
import design_patterns.creational.abstract_factory.product.checkbox.Checkbox;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}