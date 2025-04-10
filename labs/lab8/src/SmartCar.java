public class SmartCar extends AVehicle {
    public SmartCar() {}

    public SmartCar(String model, IEngine engine) {
        super(model, engine);
    }

    @Override
    public void drive() {
        System.out.println("SmartCar is driving");
    }

    @Override
    public void fly() {
        System.out.println("SmartCar flying with engine power = " + getEngine().getHorsePower());
    }

    @Override
    public void stop() {
        System.out.println("SmartCar stopped");
    }

    @Override
    public void communicate() {
        System.out.println("SmartCar is communicating with GPS system");
    }

    @Override
    public void powerOn() {
        System.out.println("SmartCar is powered on");
    }
}
