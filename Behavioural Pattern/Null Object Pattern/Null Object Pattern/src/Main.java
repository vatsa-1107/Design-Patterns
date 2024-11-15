public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        System.out.println(vehicleFactory.getObj("bike").getEngineCapacity());
    }
}