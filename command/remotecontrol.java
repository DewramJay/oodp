package command;

public class remotecontrol {
    private command command;

    public void setCommand(command command) {
        this.command = command;
    }

    public void pressbutton(){
        command.execute();
    }
}
