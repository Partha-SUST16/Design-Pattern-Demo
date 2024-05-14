package design_patterns.behavioural.command.invoker;

import design_patterns.behavioural.command.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
