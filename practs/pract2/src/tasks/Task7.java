package tasks;

import java.util.Scanner;

public class Task7 {
    static public void run() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double s = 0;

        for (int i = 1; i < 10; i++) {
            s += (Math.pow(x, 4 * i + 1) / (4 * i + 1));
        }

        System.out.println(s);
    }
}
