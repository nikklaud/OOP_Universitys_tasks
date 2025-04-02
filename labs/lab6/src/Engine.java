abstract class Engine {
    double engineVolume;
    int cylinderAmount;
    double engineWeight;

    public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    abstract double efficiency();
    abstract double throttleEnergy();
    abstract double breakEnergy();

    double getMaxSpeed() {
        return (throttleEnergy() - breakEnergy()) * efficiency();
    }
}
