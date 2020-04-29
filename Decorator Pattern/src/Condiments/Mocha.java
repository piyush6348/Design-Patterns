package Condiments;

import Beverage.Beverage;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " , Mocha";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 1.5;
    }
}
