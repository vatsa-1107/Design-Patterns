package WithStrategyDesignPattern;

public class Vehicle {
    DriveInterface obj;
    Vehicle(DriveInterface obj){
        this.obj = obj;
    }
    public void drive(){
        obj.drive();
    }
}
