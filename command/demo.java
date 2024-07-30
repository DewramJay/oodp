package command;

public class demo {
    public static void main(String[] args) {
        // Create devices
        tv tv = new tv();
        stereo stereo = new stereo();

        // Create command objects
        command turnOnTVCommand = new turnoncommand(tv);
        command turnOffTVCommand = new turnoffcommand(tv);
        command adjustVolumeStereoCommand = new adjustvolume(stereo);
        command changeChannelTVCommand = new channelchange(tv);

        // Create remote control
        remotecontrol remote = new remotecontrol();

        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressbutton();

        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressbutton();

        remote.setCommand(changeChannelTVCommand);
        remote.pressbutton();

        remote.setCommand(turnOffTVCommand);
        remote.pressbutton();
    }
}

