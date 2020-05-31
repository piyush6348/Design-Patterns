public class NoQuarterState implements IState {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter inserted");
        this.gumballMachine.setState(this.gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter that you can eject");
    }

    @Override
    public void rotateCrank() {
        System.out.println("Please insert a quarter first and then rotate");
    }

    @Override
    public void dispense() {
        System.out.println("Please insert a quarter first");
    }
}
