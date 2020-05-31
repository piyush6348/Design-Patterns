package IngredientFactory;

import Ingredients.Classes.MozarrellaCheese;
import Ingredients.Classes.OnionGarlicSauce;
import Ingredients.Classes.ThickCrustDough;
import Ingredients.Classes.Veggie1;
import Ingredients.Interfaces.ICheese;
import Ingredients.Interfaces.IDough;
import Ingredients.Interfaces.ISauce;
import Ingredients.Interfaces.IVeggie;

public class NYStylePizzaIngredientFactory implements IPizzaIngredientFactory {
    @Override
    public IDough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public ISauce createSauce() {
        return new OnionGarlicSauce();
    }

    @Override
    public ICheese createCheese() {
        return new MozarrellaCheese();
    }

    @Override
    public IVeggie[] createVeggies() {
        return new IVeggie[] { new Veggie1() };
    }
}
