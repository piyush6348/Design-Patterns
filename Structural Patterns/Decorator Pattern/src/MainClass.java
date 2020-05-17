import Beverage.Beverage;
import Beverage.HouseBlend;
import Condiments.Mocha;
import Condiments.Whip;

public class MainClass {
    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        Beverage houseBlendWithWhip = new Whip(houseBlend);
        Beverage houseBlendWithWhipWithMocha = new Mocha(houseBlendWithWhip);
        Beverage houseBlendWithWhipWithDoubleMocha = new Mocha(houseBlendWithWhipWithMocha);
        Beverage houseBlendWithDoubleWhipWithDoubleMocha = new Whip(houseBlendWithWhipWithDoubleMocha);

        System.out.println(houseBlend.getDescription() + " " + houseBlend.cost());
        System.out.println(houseBlendWithWhip.getDescription() + " " + houseBlendWithWhip.cost());
        System.out.println(houseBlendWithWhipWithMocha.getDescription() + " " + houseBlendWithWhipWithMocha.cost());
        System.out.println(houseBlendWithWhipWithDoubleMocha.getDescription() + " " + houseBlendWithWhipWithDoubleMocha.cost());
        System.out.println(houseBlendWithDoubleWhipWithDoubleMocha.getDescription() + " " + houseBlendWithDoubleWhipWithDoubleMocha.cost());
    }
}
