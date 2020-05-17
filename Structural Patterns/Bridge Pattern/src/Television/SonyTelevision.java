package Television;

import Television.ITelevision;

public class SonyTelevision implements ITelevision {
    @Override
    public void on() {
        // Switches on the TV by clicking on Button X1
    }

    @Override
    public void off() {
        // Switches on the TV by clicking on Button X2
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
