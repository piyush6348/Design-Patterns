public class CricketBall implements IShoppingElement {
    private String brand;
    private int price;
    private double weight;

    public CricketBall(String brand, int price, double weight) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public Double visit(IVisitor visitor) {
        return visitor.accept(this);
    }
}
