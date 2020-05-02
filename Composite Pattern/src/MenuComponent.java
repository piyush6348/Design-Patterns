public abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new IllegalStateException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new IllegalStateException();
    }
    public MenuComponent getChild(int index) {
        throw new IllegalStateException();
    }
    public String getName() {
        throw new IllegalStateException();
    }
    public String getPrice() {
        throw new IllegalStateException();
    }
    public String getDescription() {
        throw new IllegalStateException();
    }
    public boolean isVegetarian() {
        throw new IllegalStateException();
    }
    public void print() {
        throw new IllegalStateException();
    }
}
