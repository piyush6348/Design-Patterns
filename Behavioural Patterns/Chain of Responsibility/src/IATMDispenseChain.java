public abstract class IATMDispenseChain {
    IATMDispenseChain nextChain;

    public void setNextChain(IATMDispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    public abstract void dispense(int amount);
}
