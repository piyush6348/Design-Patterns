package Commands;

import Appliances.Geyser;

public class GeyserOffCommand implements ICommand {
    private Geyser geyser;

    public GeyserOffCommand(Geyser geyser) {
        this.geyser = geyser;
    }

    @Override
    public void execute() {
        // Turns OFF geyser
    }
}
