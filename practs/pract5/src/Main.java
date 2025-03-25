public class Main {
    public static void main(String[] args) {
        String name = "Titov Nikita";

        Student[] students_list = {
                new Student("Abdurakhman", "Legendov", "B2", 110d),
                new Student("Aleksei", "Moskowski", "B1", 60d),
                new Student("Elizar", "Dotov", "B2", 80d),
                new Aspirant("Vasya", "Puplin", "A1", 90d, "Theory of line in dota")
        };

        System.out.println();
        for (Student student: students_list) {
            System.out.println(student.firstName);
            student.getScholarship();
        }

        System.out.println("=========================================");
        Animal[] animals = {
                new Dog("Шарик", 15, 0.5, 5),
                new Dog("Бобик", 20, 0.6, 7),
                new Dog("Рекс", 25, 0.7, 6),
                new Dog("Тузик", 18, 0.55, 4),
                new Dog("Лорд", 22, 0.65, 8),
                new Cat("Мурка", 4, 0.3, 3),
                new Cat("Барсик", 5, 0.4, 4),
                new Cat("Снежок", 6, 0.35, 2),
                new Cat("Василий", 7, 0.38, 5),
                new Cat("Луна", 4.5, 0.33, 3),
                new Bear("Миша", 200, 2.1, 10),
                new Bear("Балу", 250, 2.3, 12),
                new Bear("Потапыч", 230, 2.2, 11),
                new Bear("Топтыгин", 260, 2.4, 13),
                new Bear("Умка", 190, 2.0, 9)
        };

        for (Animal animal : animals) {
            System.out.println(animal.getDescription());
            animal.makeNoise();
            animal.eat();
            System.out.println();
        }

    }
}