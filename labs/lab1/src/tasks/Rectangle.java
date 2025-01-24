package tasks;

import java.util.Scanner;

public class Rectangle {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();
        double s = length * width;
        double p = 2 * (length + width);
        System.out.printf("Площадь: %.2f%n", s);
        System.out.printf("Периметр: %.2f%n", p);
    }
}
