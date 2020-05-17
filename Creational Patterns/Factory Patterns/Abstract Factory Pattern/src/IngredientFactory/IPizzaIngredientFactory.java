package IngredientFactory;

import Ingredients.Interfaces.ICheese;
import Ingredients.Interfaces.IDough;
import Ingredients.Interfaces.ISauce;
import Ingredients.Interfaces.IVeggie;

public interface IPizzaIngredientFactory {
    // Every method is a Factory Method in abstract factory design pattern

    public IDough createDough();
    public ISauce createSauce();
    public ICheese createCheese();
    public IVeggie[] createVeggies();
}
