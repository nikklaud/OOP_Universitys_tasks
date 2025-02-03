package tasks;

import java.util.Scanner;

public class Task5 {
    static private long fac(long n) {
        long res = 1;
        for (long i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
    static public void run() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double s = 0;

        for (int i = 1; i < 10; i++) {
            s += Math.pow(-1, i) * ((2 * i * Math.pow(x, 2 * i + 1)/ fac(2 * i + 1)));
        }

        System.out.println(s);
    }
}
