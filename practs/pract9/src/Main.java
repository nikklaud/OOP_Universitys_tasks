import grades.*;
import library.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        SubjectGradeService math = new SubjectGradeService("Математика");
        SubjectGradeService physics = new SubjectGradeService("Физика");

        math.addGrade("Алиса", 5);
        math.addGrade("Алиса", 4);
        math.addGrade("Борис", 3);

        physics.addGrade("Алиса", 5);
        physics.addGrade("Борис", 5);
        physics.addGrade("Борис", 4);

        System.out.println("Оценки по " + math.getSubjectName() + ":");
        math.printAllGrades();

        System.out.println("\nОценки по " + physics.getSubjectName() + ":");
        physics.printAllGrades();

        // Задание 2
        LibraryCatalog library = new Library("Simple Library");

        library.addAuthor("J.K. Rowling", Arrays.asList("Harry Potter", "Fantastic Beasts"));
        library.addAuthor("J.R.R. Tolkien", Arrays.asList("The Hobbit"));

        library.printCatalog();

        System.out.println("\nBooks by J.K. Rowling: " + library.getBooksByAuthor("J.K. Rowling"));

        System.out.println("\nAll authors:");
        Map<String, List<String>> allAuthors = library.getAllAuthors();
        for (Map.Entry<String, List<String>> entry : allAuthors.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
