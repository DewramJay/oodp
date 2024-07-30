package command;

public class adjustvolume implements command{
    private stereo stereo;

    public adjustvolume(stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.adjustvolume();
    }
}
