package tasks;

import java.util.Scanner;

public class Task3 {
    static public void run() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (x <= 1) {
            System.out.println(1/(Math.pow(a, 2) + Math.pow(x,2)));
        } else {
            System.out.println(b * Math.log(Math.abs(x)));
        }
    }
}
