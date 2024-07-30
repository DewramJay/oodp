package command;

public class tv implements device{
    @Override
    public void turnon() {
        System.out.println("tv is on");
    }

    @Override
    public void turnoff() {
        System.out.println("tv is off");
    }

    public void channelchange(){
        System.out.println("tv channel changed");
    }
}
