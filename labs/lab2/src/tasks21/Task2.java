package tasks21;

import java.util.Scanner;

public class Task2 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        if (num1 > 0 && num1 < 1 && num2 > 0 && num2 < 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
