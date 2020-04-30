package Pizza;

import Ingredients.Interfaces.ICheese;
import Ingredients.Interfaces.IDough;
import Ingredients.Interfaces.ISauce;
import Ingredients.Interfaces.IVeggie;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected IDough dough;
    protected ISauce sauce;
    protected ICheese cheese;
    protected IVeggie[] veggies;

    protected ArrayList<String> toppings = new ArrayList<>();

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking pizza");
    }

    public void cut() {
        System.out.println("Cut pizza");
    }

    public void box() {
        System.out.println("Pack the pizza");
    }

    public String getName() {
        return name;
    }
}
