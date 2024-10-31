package DecoratorPattern;

public class ExtraMushroomsOnPizza extends ToppingsDecorator{
    BasePizza basePizza;
    public ExtraMushroomsOnPizza(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
