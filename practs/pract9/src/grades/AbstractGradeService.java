package grades;

import java.util.*;

public abstract class AbstractGradeService implements GradeService {
    protected Map<String, List<Integer>> gradesMap = new HashMap<>();

    @Override
    public void addGrade(String studentName, int grade) {
        gradesMap.putIfAbsent(studentName, new ArrayList<>());
        gradesMap.get(studentName).add(grade);
    }

    @Override
    public List<Integer> getGrades(String studentName) {
        return gradesMap.getOrDefault(studentName, new ArrayList<>());
    }

    @Override
    public void printAllGrades() {
        for (Map.Entry<String, List<Integer>> entry : gradesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
