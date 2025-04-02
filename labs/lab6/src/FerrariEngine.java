class FerrariEngine extends Engine {
    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    @Override
    double efficiency() { return 0.25; }

    @Override
    double throttleEnergy() { return engineVolume * cylinderAmount * 100; }

    @Override
    double breakEnergy() { return engineWeight * 2; }
}