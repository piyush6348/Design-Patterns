package Beverage;

public abstract class Beverage {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
