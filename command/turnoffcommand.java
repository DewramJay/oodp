package command;

public class turnoffcommand implements command{
    private device device;

    public turnoffcommand(device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnoff();
    }
}
