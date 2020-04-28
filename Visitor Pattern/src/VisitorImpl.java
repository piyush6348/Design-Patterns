public class VisitorImpl implements IVisitor {
    @Override
    public double accept(CricketBall cricketBall) {
        double finalPrice = cricketBall.getPrice();

        if (cricketBall.getBrand() == "MRF") {
            // Discount is 10%
            finalPrice = 0.9 * finalPrice;
        } else if (cricketBall.getBrand() == "Britannia") {
            // Discount is 12%
            finalPrice = 0.88 * finalPrice;
        } else {
            // Discount is 5%
            finalPrice = 0.95 * finalPrice;
        }
        return finalPrice;
    }

    @Override
    public double accept(CricketBat cricketBat) {
        double finalPrice = cricketBat.getPrice();

        if (cricketBat.getBrandName() == "MRF") {
            // Discount is 15%
            finalPrice = 0.85 * finalPrice;
        } else if (cricketBat.getBrandName() == "Britannia") {
            // Discount is 30%
            finalPrice = 0.70 * finalPrice;
        } else {
            // Discount is 10%
            finalPrice = 0.90 * finalPrice;
        }
        return finalPrice;
    }

    @Override
    public double accept(VolleyBall volleyBall) {
        double finalPrice = volleyBall.getPrice();

        if (volleyBall.getBrand() == "MRF") {
            // Discount is 15%
            finalPrice = 0.85 * finalPrice;
        } else if (volleyBall.getBrand() == "Britannia") {
            // Discount is 30%
            finalPrice = 0.70 * finalPrice;
        } else {
            // Discount is 10%
            finalPrice = 0.90 * finalPrice;
        }
        return finalPrice;
    }
}
