package Television;

public class SamsungSmartTelevision implements ITelevision{
    @Override
    public void on() {
        // Switches on the TV by clicking on Button Y1
    }

    @Override
    public void off() {
        // Switches off the TV by clicking on Button Y2
    }

    @Override
    public void setChannel(int channel) {
        // Sets the channel on this television
    }

    @Override
    public void setVolume(int volume) {
        // Sets the volume on this television
    }
}
