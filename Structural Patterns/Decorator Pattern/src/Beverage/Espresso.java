package Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Beverage.Espresso";
    }

    @Override
    public double cost() {
        return 0.9;
    }
}
