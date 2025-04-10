public class Main {
    public static void main(String[] args) {
        // Задание 1
        APlant apple = new Fruit("Apple");
        APlant carrot = new Vegetable("Carrot");

        apple.describe();
        apple.wash();
        apple.prepare();
        apple.eat();

        System.out.println();

        carrot.describe();
        carrot.wash();
        carrot.prepare();
        carrot.eat();

        System.out.println("\n==== Smart Vehicles ====\n");

        // Задание 2
        IEngine engine1 = new ElectricEngine(150);
        IEngine engine2 = new ElectricEngine(80);

        SmartCar car = new SmartCar("Tesla Model X", engine1);
        Drone drone = new Drone("DJI Air 3", engine2);

        car.powerOn();
        car.getEngine().start();
        car.drive();
        car.fly();
        car.communicate();
        car.stop();
        car.powerOff();

        System.out.println();

        drone.powerOn();
        drone.getEngine().start();
        drone.drive();
        drone.fly();
        drone.communicate();
        drone.stop();
        drone.powerOff();
    }
}
