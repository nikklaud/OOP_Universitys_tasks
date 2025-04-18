package grades;

import java.util.List;

public interface GradeService {
    void addGrade(String studentName, int grade);
    List<Integer> getGrades(String studentName);
    void printAllGrades();
}
