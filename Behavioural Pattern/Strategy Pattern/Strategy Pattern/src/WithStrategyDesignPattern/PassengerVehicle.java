package WithStrategyDesignPattern;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(){
        super(new NormalDrive());
    }
}
