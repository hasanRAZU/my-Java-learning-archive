package design_pattern.creational_design_pattern.$3__factory_design_pattern;

interface Vehicle{
    void drive();
}

class Car implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Car drive...");
    }
}

class Bike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Bike drive...");
    }
}


class VehicleFactory{
    static Vehicle createVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("Car")){
            return new Car();
        }
        else if(vehicleType.equalsIgnoreCase("Bike")){
            return new Bike();
        }
        return null;
    }
}





public class FactoryDesignPattern{
    static void main() {
        Vehicle vehicle1 = VehicleFactory.createVehicle("Bike");
        Vehicle vehicle2 = VehicleFactory.createVehicle("Car");

        vehicle1.drive();
        vehicle2.drive();
    }
}