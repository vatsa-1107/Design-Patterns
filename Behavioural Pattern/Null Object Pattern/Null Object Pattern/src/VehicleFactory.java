public class VehicleFactory {
    public Vehicle getObj(String name){
        if(name.equalsIgnoreCase("Car")){
            return new Car();
        }
        return new NullObject();
    }
}
