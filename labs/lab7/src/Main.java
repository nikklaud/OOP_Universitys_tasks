import db.Queries;
import model.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Queries.printConnectionStatus();

        System.out.println("\nПервые 10 студентов, отсортированные по имени:");
        List<Student> topStudents = Queries.getTop10StudentsSorted();
        topStudents.forEach(System.out::println);

        Queries.getTranscriptForOliverJones();

        Queries.insertSampleData();
    }
}
