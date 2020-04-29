import PizzaFactory.PizzaFactory;
import PizzaFactory.*;

public class MainClass {
    public static void main(String[] args) {
        PizzaFactory chicagoStylePizzaFactory = new ChicagoStylePizzaFactory();
        chicagoStylePizzaFactory.getPizza("Cheese");
    }
}
