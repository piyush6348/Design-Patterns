public class MainClass {
    public static void main(String[] args) {
        IDuck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();

        ITurkey turkey = new RoyalPalmTurkey();
        turkey.gobble();
        turkey.fly();

        IDuck duck = new TurkeyAdapter(turkey);
        duck.quack();
        duck.fly();
    }
}
