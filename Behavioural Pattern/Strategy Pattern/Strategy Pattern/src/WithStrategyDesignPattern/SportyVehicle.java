package WithStrategyDesignPattern;

public class SportyVehicle extends Vehicle{
    public SportyVehicle(){
        super(new SpecialDrive());
    }
}
