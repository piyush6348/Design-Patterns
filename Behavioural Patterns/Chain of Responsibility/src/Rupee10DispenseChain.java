public class Rupee10DispenseChain extends IATMDispenseChain {
    @Override
    public void dispense(int amount) {
        if (amount >= 10) {
            int notes = amount / 10;
            int remainingAmount = amount % 10;
            System.out.println("Number of 10 Rs notes are " + String.valueOf(notes));
        } else if (amount > 0) {
            nextChain(amount);
        }
    }
}
