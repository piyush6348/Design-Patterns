import Commands.ICommand;
import Commands.NoCommand;

public class RemoteControl {
    private ICommand[] onCommands;
    private ICommand[] offCommands;

    public RemoteControl() {
        onCommands = new ICommand[7];
        offCommands = new ICommand[7];

        for(int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
    }
}
