package tasks;

import java.util.Scanner;

public class AverageOfThree {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите три числа: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.printf("Среднее значение: %.2f%n", average);
    }
}
