public class MainClass {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setStateDependentVar1("State Dependent Variable 1");
        originator.setStateDependentVar2("State Dependent Variable 2");
        originator.setStateLessVar1(100);
        originator.setStateLessVar2(200);

        Caretaker caretaker = new Caretaker();
        caretaker.saveState(originator);

        System.out.println(originator);

        originator.setStateDependentVar1("State Dependent Variable 1 changed");

        System.out.println("Changed value " + originator);
        caretaker.restoreState(originator);

        System.out.println("Restored value " + originator);
    }
}
