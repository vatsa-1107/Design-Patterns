package WithStrategyDesignPattern;

public class OffroadVehicle extends Vehicle{
    public OffroadVehicle(){
        super(new SpecialDrive());
    }
}
