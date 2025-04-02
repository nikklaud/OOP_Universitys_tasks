public class Main {
    public static void main(String[] args) {

        Person student = new Student("Иван", 20);
        Person employee = new Employee("Анна", 35);

        student.displayInfo();
        employee.displayInfo();


        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("Красный", 5, 5, 10);
        shapes[1] = new Rectangle("Синий", 0, 0, 15, 10);

        for (Shape shape : shapes) {
            shape.draw();
        }

        Engine[] engines = new Engine[10];
        engines[0] = new FerrariEngine(4.0, 8, 200);
        engines[1] = new FerrariEngine(3.9, 6, 190);
        engines[2] = new FerrariEngine(4.5, 10, 220);
        engines[3] = new FerrariEngine(4.2, 8, 210);
        engines[4] = new FerrariEngine(3.8, 6, 180);
        engines[5] = new RenaultEngine(3.5, 6, 180, 50);
        engines[6] = new RenaultEngine(3.7, 6, 190, 60);
        engines[7] = new RenaultEngine(4.0, 8, 200, 70);
        engines[8] = new RenaultEngine(3.8, 6, 185, 55);
        engines[9] = new RenaultEngine(4.1, 8, 210, 80);

        for (Engine engine : engines) {
            System.out.println("Максимальная скорость: " + engine.getMaxSpeed());
        }
    }
}
