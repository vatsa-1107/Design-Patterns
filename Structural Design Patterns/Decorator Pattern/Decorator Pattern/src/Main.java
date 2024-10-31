import DecoratorPattern.BasePizza;
import DecoratorPattern.ExtraCheeseOnPizza;
import DecoratorPattern.ExtraMushroomsOnPizza;
import DecoratorPattern.MargheritaPizza;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraMushroomsOnPizza(new ExtraCheeseOnPizza(new MargheritaPizza()));
        System.out.println(pizza.cost());
    }
}