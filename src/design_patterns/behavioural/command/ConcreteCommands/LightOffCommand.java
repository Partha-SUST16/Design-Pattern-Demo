package design_patterns.behavioural.command.ConcreteCommands;

import design_patterns.behavioural.command.Command;
import design_patterns.behavioural.command.receiver.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
