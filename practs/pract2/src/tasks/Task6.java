package tasks;

import java.util.Scanner;

public class Task6 {
    static public void run() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double s = 0;

        for (int i = 0; i < 10; i++) {
            s += (Math.pow(x, 2*i+1) / (2 * i + 1));
        }

        System.out.println(s);
    }
}
