package tasks;

import java.util.Scanner;

public class DecimalToBinary {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите десятичное число: ");
        int decimal = scanner.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.printf("Двоичное представление: %s%n", binary);
    }
}
