public class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student() {
        this.id = 0;
        this.name = "Unknown";
        this.surname = "Unknown";
        this.gpa = 0.0;
    }
    public Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentData() {
        return String.format("ID: %s, Name: %s, Surname: %s, GPA: %f", id, name, surname, gpa);
    }
    public static String topStudent(Student students[]) {
        double maxx = 0.0;
        String top = "";
        for (Student student : students){
            if (student.gpa > maxx) {
                maxx = student.gpa;
                top = student.name;
            }
        }
        return String.format("Top student: %s with gpa %f", top, maxx);
    }
}
