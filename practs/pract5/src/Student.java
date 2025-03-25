public class Student {
    String firstName;
    String lastName;
    String group;
    Double averageMark;

    public Student (String firstName, String lastName, String group, Double averageMark ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void getScholarship() {
        if (this.averageMark >= 90) {
            System.out.println("Стипендия - 25 000 тг");
        } else {
           System.out.println("Стипендия - 20 000 тг");
        }
    }
}
