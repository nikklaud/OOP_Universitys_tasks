import java.util.HashSet;

public abstract class AbstractCourse implements Course {
    protected String name;
    protected int duration; // в неделях
    protected HashSet<Student> students = new HashSet<>();

    public AbstractCourse(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public String getCourseName() {
        return name;
    }
}
