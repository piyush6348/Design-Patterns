public class GumballMachine {
    private IState noQuarterState;
    private IState hasQuarterState;
    private IState soldOutState;
    private IState soldState;
    private int gumBallCount;

    private IState currentState;

    public GumballMachine(int gumBallCount) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);

        this.gumBallCount = gumBallCount;
        if(gumBallCount > 0)
            currentState = noQuarterState;
        else
            currentState = soldOutState;
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void rotateCrank() {
        currentState.rotateCrank();
        currentState.dispense();
    }

    public void dispense() {
        System.out.println("Gumball released");
        if (gumBallCount != 0)
            gumBallCount -= 1;
    }

    public void setState(IState state) {
        this.currentState = state;
    }

    public IState getNoQuarterState() {
        return noQuarterState;
    }

    public IState getHasQuarterState() {
        return hasQuarterState;
    }

    public IState getSoldOutState() {
        return soldOutState;
    }

    public IState getSoldState() {
        return soldState;
    }

    public int getGumBallCount() {
        return gumBallCount;
    }
}
