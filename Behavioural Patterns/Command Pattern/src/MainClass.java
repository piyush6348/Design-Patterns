import Appliances.Geyser;
import Appliances.Light;
import Commands.*;

public class MainClass {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light bathroomLight = new Light();
        ICommand bathRoomLightOnCommand = new LightOnCommand(bathroomLight);
        ICommand bathRoomLightOffCommand = new LightOffCommand(bathroomLight);

        Light livingRoomLight = new Light();
        ICommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        ICommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        Geyser masterBedRoomGeyser = new Geyser();
        ICommand masterBedRoomGeyserOnCommand = new GeyserOnCommand(masterBedRoomGeyser);
        ICommand masterBedRoomGeyserOffCommand = new GeyserOffCommand(masterBedRoomGeyser);

        remoteControl.setCommand(0, bathRoomLightOnCommand, bathRoomLightOffCommand);
        remoteControl.setCommand(1, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(2, masterBedRoomGeyserOnCommand, masterBedRoomGeyserOffCommand);

        remoteControl.onButtonPushed(3);
        remoteControl.onButtonPushed(1);
        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(1);
    }
}
