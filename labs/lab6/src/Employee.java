public class Employee extends Person {
    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    void displayInfo() {
        System.out.println("Сотрудник: " + name + ", Возраст: " + age);
    }
}
