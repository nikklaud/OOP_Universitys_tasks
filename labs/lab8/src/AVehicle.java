public abstract class AVehicle implements IVehicle {
    private String model;
    private IEngine engine;

    public AVehicle() {}

    public AVehicle(String model, IEngine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    @Override
    public void powerOn() {
        System.out.println("Vehicle is powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("Vehicle is powered off");
    }
}
