public class Caretaker {
    private Object savedState;

    public void saveState(Originator originator) {
        this.savedState = originator.getState();
    }

    public void restoreState(Originator originator) {
        originator.restoreState(savedState);
    }
}
