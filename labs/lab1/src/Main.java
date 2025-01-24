import java.util.Scanner;
import tasks.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВыберите задачу:");
            System.out.println("1. Конвертация температуры");
            System.out.println("2. Среднее из трёх чисел");
            System.out.println("3. Площадь и периметр прямоугольника");
            System.out.println("4. Преобразование десятичного числа в двоичное");
            System.out.println("5. Вычисление формулы");
            System.out.println("0. Выход");
            System.out.print("Введите номер задачи: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> CelsiusToFahrenheit.run();
                case 2 -> AverageOfThree.run();
                case 3 -> Rectangle.run();
                case 4 -> DecimalToBinary.run();
                case 5 -> FormulaCalculation.run();
                case 0 -> {
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }
}