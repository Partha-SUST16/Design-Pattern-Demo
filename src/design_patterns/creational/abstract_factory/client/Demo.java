package design_patterns.creational.abstract_factory.client;

import design_patterns.creational.abstract_factory.abstract_factory.GuiFactory;
import design_patterns.creational.abstract_factory.concrete_factory.MacOSFactory;
import design_patterns.creational.abstract_factory.concrete_factory.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
