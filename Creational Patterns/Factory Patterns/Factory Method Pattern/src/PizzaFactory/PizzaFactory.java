package PizzaFactory;

import Pizza.Pizza;

public abstract class PizzaFactory {
    public final Pizza getPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
