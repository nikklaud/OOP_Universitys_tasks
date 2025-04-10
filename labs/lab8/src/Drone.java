public class Drone extends AVehicle {
    public Drone() {}

    public Drone(String model, IEngine engine) {
        super(model, engine);
    }

    @Override
    public void drive() {
        System.out.println("Drone can't drive on ground, only flying");
    }

    @Override
    public void fly() {
        System.out.println("Drone is flying with engine power = " + getEngine().getHorsePower());
    }

    @Override
    public void stop() {
        System.out.println("Drone is landing and stopped");
    }

    @Override
    public void communicate() {
        System.out.println("Drone is communicating with control center");
    }
}
