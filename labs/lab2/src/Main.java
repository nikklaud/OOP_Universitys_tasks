import tasks21.*;
//import task22.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите раздел:");
            System.out.println("1. Условные выражения");
            System.out.println("2. Работа с циклами");
            System.out.print("Ваш выбор (1 или 2, 0 для выхода): ");
            int sectionChoice = scanner.nextInt();

            if (sectionChoice == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            switch (sectionChoice) {
                case 1 -> {
                    System.out.println("Выберите задачу из раздела Условные выражения (1-8):");
                    System.out.println("1. Вычисление выражений");
                    System.out.println("2. Проверка чисел на принадлежность диапазону [0, 1]");
                    System.out.println("3. Проверка кратности чисел 5 и 7");
                    System.out.println("4. Арифметические операции с двумя числами");
                    System.out.println("5. Определение знака числа");
                    System.out.println("6. Нахождение наибольшего из трёх чисел");
                    System.out.println("7. День недели по номеру");
                    System.out.println("8. Гласная или согласная");
                    System.out.print("Ваш выбор: ");
                    int taskChoice = scanner.nextInt();
                    switch (taskChoice) {
                        case 1 -> new Task1().run();
                        case 2 -> new Task2().run();
//                        case 3 -> new Task3().run();
//                        case 4 -> new Task4().run();
//                        case 5 -> new Task5().run();
//                        case 6 -> new Task6().run();
//                        case 7 -> new Task7().run();
//                        case 8 -> new Task8().run();
                        default -> System.out.println("Неверный выбор.");
                    }
                }
                case 2 -> {
                    System.out.println("Выберите задачу из раздела Работа с циклами (1-4):");
                    System.out.println("1. Числа Фибоначчи");
                    System.out.println("2. Сумма четных и нечетных чисел");
                    System.out.println("3. Цикл do-while");
                    System.out.println("4. Ввод чисел до 0");
                    System.out.print("Ваш выбор: ");
                    int taskChoice = scanner.nextInt();
                    switch (taskChoice) {
//                        case 1 -> new TaskFibonacci().run();
//                        case 2 -> new TaskEvenOddSum().run();
//                        case 3 -> new TaskDoWhile().run();
//                        case 4 -> new TaskInputUntilZero().run();
                        default -> System.out.println("Неверный выбор.");
                    }
                }
                default -> System.out.println("Неверный выбор.");
            }
        }
    }
}
