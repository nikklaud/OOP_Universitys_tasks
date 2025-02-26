public class Main {
    public static void main(String[] args) {
        //Task 1
        Supermarket supermarket = new Supermarket("Small", "Almaty", 100, 1200, 14);

        supermarket.display();
        System.out.println("\n");

        //Task2
        Student student1 = new Student(1, "Nikita", "Kolodec", 2.98);
        Student student2 = new Student(2, "Abdurakhman", "Amantaev", 999.9);
        Student student3 = new Student(3, "Oleg", "Gay", 2.54);
        Student student4 = new Student(4, "Vladimir", "Molodec", 3.12);
        Student student5 = new Student(5, "Nikita", "Putin", 3.82);

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student.getStudentData());
        }

        //Task3

        System.out.println(Student.topStudent(students));

        //Task4
        int[] arr = {4, 9, 3, 2, 1, 8, 7, 6, 5};

        System.out.println(ValueCalculation.maxx(arr));
        System.out.println(ValueCalculation.minn(arr));
        System.out.println(ValueCalculation.mediana(arr));

        //Task5
        for (int num : SortValues.choose(arr)) {
            System.out.printf("%d ", num);
        }
        System.out.print("\n");
        for (int num : SortValues.insert(arr)) {
            System.out.printf("%d ", num);
        }
    }
}