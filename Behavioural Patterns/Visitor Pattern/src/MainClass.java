import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        IShoppingElement britanniaCricketBat = new CricketBat("Britannia", 100);
        IShoppingElement britanniaCricketBall = new CricketBall("Britannia", 80, 76.0);
        IShoppingElement mrfVolleyBall = new VolleyBall("MRF", 200, 350.0, true);

        ArrayList<IShoppingElement> products = new ArrayList<>();
        products.add(britanniaCricketBall);
        products.add(britanniaCricketBat);
        products.add(mrfVolleyBall);

        ArrayList<Double> discountedPrices = getDiscountedPrices(products);
        for(int i = 0; i < discountedPrices.size(); i++) {
            System.out.println("Discounted price for " + discountedPrices.get(i));
        }
    }

    public static ArrayList<Double> getDiscountedPrices(ArrayList<IShoppingElement> products) {
        ArrayList<Double> discountedPrices = new ArrayList<>();

        IVisitor visitor = new VisitorImpl();
        for( int i = 0; i < products.size(); i++) {
            double discountedPrice = products.get(i).visit(visitor);
            discountedPrices.add(discountedPrice);
        }
        return discountedPrices;
    }
}
