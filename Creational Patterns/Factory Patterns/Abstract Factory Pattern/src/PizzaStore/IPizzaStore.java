package PizzaStore;

import Pizza.Pizza;

public interface IPizzaStore {
    // Rather than String as type we can have something like constants/enums.
    public Pizza createPizza(String type);
}
