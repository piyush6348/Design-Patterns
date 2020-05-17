public class ATMDispenseMachine {
    private IATMDispenseChain dispenseChain;

    public ATMDispenseMachine() {
        this.dispenseChain = new Rupee50DispenseChain();
        IATMDispenseChain rupee20DispenseChain = new Rupee20DispenseChain();
        IATMDispenseChain rupee10DispenseChain = new Rupee10DispenseChain();
        rupee20DispenseChain.setNextChain(rupee10DispenseChain);
        this.dispenseChain.setNextChain(rupee20DispenseChain);
    }

    public void dispense(int amount) {
        this.dispenseChain.dispense(amount);
    }

    public static void main(String[] args) {
        ATMDispenseMachine dispenseMachine = new ATMDispenseMachine();
        dispenseMachine.dispense(100);
        System.out.println("Break");

        dispenseMachine.dispense(220);
        System.out.println("Break");

        dispenseMachine.dispense(10);
        System.out.println("Break");

        dispenseMachine.dispense(50);
        System.out.println("Break");
    }
}
