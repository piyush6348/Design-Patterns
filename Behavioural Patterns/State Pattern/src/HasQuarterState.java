public class HasQuarterState implements IState {
    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Inserting quarter into a machine again");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned back");
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
    }

    @Override
    public void rotateCrank() {
        System.out.println("You have rotated the crank");
        this.gumballMachine.setState(this.gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("In Appropriate action for this state");
    }
}
