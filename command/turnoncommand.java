package command;

public class turnoncommand implements command{
    private device device;

    public turnoncommand(device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnon();
    }
}
