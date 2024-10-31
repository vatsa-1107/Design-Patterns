package DecoratorPattern;

public class ExtraCheeseOnPizza extends ToppingsDecorator{
    BasePizza basePizza;

    public ExtraCheeseOnPizza(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
