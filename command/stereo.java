package command;

public class stereo implements device{
    @Override
    public void turnon() {
        System.out.println("stereo is on");
    }

    @Override
    public void turnoff() {
        System.out.println("stereo is off");
    }

    public void adjustvolume() {
        System.out.println("stereo volume changed");
    }
}
