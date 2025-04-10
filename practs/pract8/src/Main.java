import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Часть 1: Работа с HashSet и курсами
        OnlineCourse javaCourse = new OnlineCourse("Программирование на Java", 8, "Zoom");

        javaCourse.addStudent(new Student("Алексей", 1));
        javaCourse.addStudent(new Student("Мария", 2));
        javaCourse.addStudent(new Student("Елена", 3));
        javaCourse.addStudent(new Student("Алексей", 1)); // дубликат

        javaCourse.startCourse();
        javaCourse.printStudents();

        javaCourse.removeStudent(new Student("Мария", 2));
        System.out.println("После удаления Марии:");
        javaCourse.printStudents();
        javaCourse.endCourse();

        System.out.println("\n==========================\n");

        // Часть 2: Работа с TreeSet и деревьями
        TreeSet<AbstractTree> forest = new TreeSet<>();
        forest.add(new ConiferousTree("Сосна", 5.0));
        forest.add(new ConiferousTree("Ель", 4.2));
        forest.add(new DeciduousTree("Дуб", 7.5));
        forest.add(new DeciduousTree("Береза", 6.0));

        System.out.println("Деревья в лесу (отсортированы по высоте):");
        for (AbstractTree tree : forest) {
            System.out.println(tree);
        }

        System.out.println("\nРост деревьев:");
        for (AbstractTree tree : forest) {
            tree.grow();
        }

        System.out.println("\nДеревья после роста:");
        for (AbstractTree tree : forest) {
            System.out.println(tree);
        }

        forest.add(new ConiferousTree("Сосна", 5.5)); // дубликат по высоте

        System.out.println("\nПосле попытки добавить дубликат:");
        for (AbstractTree tree : forest) {
            System.out.println(tree);
        }
    }
}
