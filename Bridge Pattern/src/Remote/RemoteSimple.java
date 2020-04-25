package Remote;

import Television.ITelevision;

public class RemoteSimple extends RemoteControl{
    public RemoteSimple(ITelevision television) {
        super(television);
    }

    @Override
    public void on() {
        this.television.on();
    }

    @Override
    public void off() {
        this.television.off();
    }

    @Override
    public void upButtonPressed() {
        int nextChannel = this.currentChannel + 1;
        this.television.setChannel(nextChannel);
    }

    @Override
    public void downButtonPressed() {
        int previousChannel = this.currentChannel - 1;
        this.television.setChannel(previousChannel);
    }

    @Override
    public void leftButtonPressed() {
        int decreasedVolume = this.currentVolume - 1;
        this.television.setVolume(decreasedVolume);
    }

    @Override
    public void rightButtonPressed() {
        int increasedVolume = this.currentVolume + 1;
        this.television.setVolume(increasedVolume);
    }
}
