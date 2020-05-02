public class SoldState implements IState {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait! You have to fetch a gumball first");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Hey You are in process of fetching gumball. You have already rotated the crank");
    }

    @Override
    public void rotateCrank() {
        System.out.println("You have already rotated the crank once");
    }

    @Override
    public void dispense() {
        this.gumballMachine.dispense();
        int count = this.gumballMachine.getGumBallCount();
        if (count > 0)
            this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
        else
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
    }
}
