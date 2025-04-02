public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    void displayInfo() {
        System.out.println("Студент: " + name + ", Возраст: " + age);
    }
}
