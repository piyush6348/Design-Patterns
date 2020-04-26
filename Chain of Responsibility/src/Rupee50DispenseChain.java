public class Rupee50DispenseChain extends IATMDispenseChain{
    @Override
    public void dispense(int amount) {
        if (amount >= 50) {
            int notes = amount / 50;
            int remainingAmount = amount % 50;
            System.out.println("Number of 50 Rs notes are " + String.valueOf(notes));
            this.nextChain.dispense(remainingAmount);
        } else if (amount > 0) {
            this.nextChain.dispense(amount);
        }
    }
}
