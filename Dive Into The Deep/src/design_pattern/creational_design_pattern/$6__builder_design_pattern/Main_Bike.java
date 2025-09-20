package design_pattern.creational_design_pattern.$6__builder_design_pattern;


class Bike{
    private String name;
    private String enginePower;
    private String bodyType;
    private double speed;

    public void setName(String name) {
        this.name = name;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public void launch() {
        System.out.println("Bike{" +
                "name='" + name + '\'' +
                ", enginePower='" + enginePower + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", speed=" + speed + " km/hr" +
                 '}');
    }
}

class BikeBuilder{
    Bike bike = new Bike();

    public BikeBuilder setBikeName(String name) {
        bike.setName(name);
            return this;
    }
    public BikeBuilder setBikeEnginePower(String enginePower) {
        bike.setEnginePower(enginePower);
        return this;
    }
    public BikeBuilder setBikeBodyType(String bodyType) {
        bike.setBodyType(bodyType);
        return this;
    }
    public BikeBuilder setBikeSpeed(double speed) {
        bike.setSpeed(speed);
        return this;
    }
    public Bike build() {
        return bike;
    }

}






public class Main_Bike {
    static void main() {

        Bike myBike = new BikeBuilder()
                .setBikeName("Suzuki")
                .setBikeEnginePower("12 hp")
                .setBikeBodyType("Metal")
                .setBikeSpeed(240.0f)
                .build();

        myBike.launch();
    }
}
