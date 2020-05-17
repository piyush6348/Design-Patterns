package PizzaFactory;

import Pizza.ChicagoStyleCheesePizza;
import Pizza.Pizza;

public class ChicagoStylePizzaFactory extends PizzaFactory{
    @Override
    protected Pizza createPizza(String type) {
        if (type == "Cheese")
            return new ChicagoStyleCheesePizza();
        // we can have an if-else ladder here.
        // Also rather than String as type we can have something like constants/enums.
        return null;
    }
}
