package Commands;

import Appliances.Geyser;

public class GeyserOnCommand implements ICommand {
    private Geyser geyser;

    public GeyserOnCommand(Geyser geyser) {
        this.geyser = geyser;
    }

    @Override
    public void execute() {
        // Turns ON geyser
    }
}
