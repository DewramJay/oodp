package command;

public class channelchange implements command{
    private tv tv;

    public channelchange(tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.channelchange();
    }
}
