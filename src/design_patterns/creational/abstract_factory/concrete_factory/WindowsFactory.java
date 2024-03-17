package design_patterns.creational.abstract_factory.concrete_factory;

import design_patterns.creational.abstract_factory.abstract_factory.GuiFactory;
import design_patterns.creational.abstract_factory.product.button.Button;
import design_patterns.creational.abstract_factory.product.button.WindowsButton;
import design_patterns.creational.abstract_factory.product.checkbox.Checkbox;
import design_patterns.creational.abstract_factory.product.checkbox.WindowsCheckbox;

public class WindowsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
