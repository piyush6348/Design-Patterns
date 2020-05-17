public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private String price;
    private boolean isVegetarian;

    public MenuItem(String name, String description, String price, boolean isVegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public void print() {
        System.out.println("MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", isVegetarian=" + isVegetarian +
                '}');
    }
}
