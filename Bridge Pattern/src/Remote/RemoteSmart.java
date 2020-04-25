package Remote;

import Television.ITelevision;

public class RemoteSmart extends RemoteControl{
    public RemoteSmart(ITelevision television) {
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
        int increasedVolume = this.currentVolume + 1;
        this.television.setVolume(increasedVolume);
    }

    @Override
    public void downButtonPressed() {
        int decreasedVolume = this.currentVolume - 1;
        this.television.setVolume(decreasedVolume);
    }

    @Override
    public void leftButtonPressed() {
        int previousChannel = this.currentChannel - 1;
        this.television.setChannel(previousChannel);
    }

    @Override
    public void rightButtonPressed() {
        int nextChannel = this.currentChannel + 1;
        this.television.setChannel(nextChannel);
    }
}
