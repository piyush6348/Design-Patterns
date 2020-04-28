public class VolleyBall implements IShoppingElement {
    private String brand;
    private int price;
    private double weight;
    private boolean isFilledWithAir;

    public VolleyBall(String brand, int price, double weight, boolean isFilledWithAir) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
        this.isFilledWithAir = isFilledWithAir;
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

    public boolean isFilledWithAir() {
        return isFilledWithAir;
    }

    @Override
    public Double visit(IVisitor visitor) {
        return visitor.accept(this);
    }
}
