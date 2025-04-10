public class ElectricEngine implements IEngine {
    private int horsePower;

    public ElectricEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        System.out.println("Electric engine started");
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }
}
