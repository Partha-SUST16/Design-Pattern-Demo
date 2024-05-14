package design_patterns.behavioural.command.client;

import design_patterns.behavioural.command.ConcreteCommands.LightOffCommand;
import design_patterns.behavioural.command.ConcreteCommands.LightOnCommand;
import design_patterns.behavioural.command.invoker.RemoteControl;
import design_patterns.behavioural.command.receiver.Light;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);

        remoteControl.pressButton();

        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}
