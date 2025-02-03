package tasks;

import java.util.Scanner;

public class Task4 {
    static public void run() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double l = 0;
        double s = 0;

        for (int i = 1; i < 10000; i++) {
            l += 1d / i;
            s += l * (Math.pow(x, i + 1)/ (i + 1));
        }

        System.out.println(2 * s);
    }
}
