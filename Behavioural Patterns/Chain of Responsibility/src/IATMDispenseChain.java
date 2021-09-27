public abstract class IATMDispenseChain {
    IATMDispenseChain nextChain;

    public void setNextChain(IATMDispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    public abstract void dispense(int amount);
    
    public void nextChain(int amount) {
        if (this.nextChain != null) {
            this.nextChain.dispense(amount);
        } else {
            System.out.println("No notes can be dispensed");
        }
    }
}
