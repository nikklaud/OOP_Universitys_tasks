public class Aspirant extends Student {
    String work;

    public Aspirant(String firstName, String lastName, String group, Double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    @Override
    public void getScholarship() {
        if (this.averageMark >= 90) {
            System.out.println("Стипендия - 150 000тг");
        } else {
            System.out.println("Стипендия  - 200 000тг");
        }
    }
}
