package tasks;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Температура в градусах Фаренгейта: %.2f%n", fahrenheit);
    }
}
