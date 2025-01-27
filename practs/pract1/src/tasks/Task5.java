package tasks;

import java.util.Scanner;

public class Task5 {
    static public void run() {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();

        System.out.printf("%d x %d = %d", a, b, a * b);
    }
}
