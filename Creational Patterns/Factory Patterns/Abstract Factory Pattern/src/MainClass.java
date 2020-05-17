import PizzaStore.ChicagoPizzaStore;
import PizzaStore.IPizzaStore;
import PizzaStore.NYPizzaStore;

public class MainClass {
    public static void main(String[] args) {
        IPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.createPizza("Cheese");

        IPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.createPizza("Cheese");
    }
}
