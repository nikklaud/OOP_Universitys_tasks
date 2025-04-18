package grades;

public class SubjectGradeService extends AbstractGradeService {
    private String subjectName;

    public SubjectGradeService(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }
}
