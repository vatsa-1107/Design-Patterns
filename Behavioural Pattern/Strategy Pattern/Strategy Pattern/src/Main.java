import WithoutStrategyDesignPattern.OffroadVehicle;
import WithoutStrategyDesignPattern.PassengerVehicle;
import WithoutStrategyDesignPattern.SportyVehicle;
import WithoutStrategyDesignPattern.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Vehicle> ls = new ArrayList<>();
        ls.add(new OffroadVehicle());
        ls.add(new PassengerVehicle());
        ls.add(new SportyVehicle());
        for(Vehicle c: ls){
            c.drive();
        }
        WithStrategyDesignPattern.Vehicle vh = new WithStrategyDesignPattern.PassengerVehicle();
        vh.drive();
    }
}
