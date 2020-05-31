public interface IVisitor {
    double accept(CricketBall cricketBall);
    double accept(CricketBat cricketBat);
    double accept(VolleyBall volleyBall);
}
