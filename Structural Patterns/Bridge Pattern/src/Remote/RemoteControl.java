package Remote;

import Television.ITelevision;

public abstract class RemoteControl {
    ITelevision television;
    int currentChannel = 0;
    int currentVolume = 0;

    public RemoteControl (ITelevision television) { this.television = television; }

    public abstract void on();
    public abstract void off();

    public abstract void upButtonPressed();
    public abstract void downButtonPressed();
    public abstract void leftButtonPressed();
    public abstract void rightButtonPressed();
}
