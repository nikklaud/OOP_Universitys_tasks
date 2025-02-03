package tasks;

import java.util.Scanner;

public class Task1 {
    static public void run() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (x <= 3) {
            System.out.println(b + (1 * Math.log(Math.abs(x))));
        } else {
            System.out.println((Math.pow(x , 2) / (Math.pow(x,2) + a)));
        }
    }
}
