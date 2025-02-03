package tasks;

import java.util.Scanner;

public class Task2 {
    static public void run() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (x > 0) {
            System.out.println(a + (0.5 * Math.exp(-x)));
        } else {
            System.out.println(Math.cos(b*x + 1));
        }
    }
}
