package PizzaStore;

import IngredientFactory.ChicagoStylePizzaIngredientFactory;
import IngredientFactory.IPizzaIngredientFactory;
import Pizza.Pizza;
import Pizza.CheesePizza;

public class ChicagoPizzaStore implements IPizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        IPizzaIngredientFactory pizzaIngredientFactory = new ChicagoStylePizzaIngredientFactory();

        // We can have an if-else ladder here
        if(type == "Cheese")
            pizza = new CheesePizza(pizzaIngredientFactory);
        return pizza;
    }
}
