public interface IVehicle extends IDevice {
    void drive();
    void fly();
    void stop();
    void communicate();
    String getModel();
    IEngine getEngine();
}
