package tasks;

public class FormulaCalculation {
    public static void run() {
        double result = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.printf("Результат вычисления: %.6f%n", result);
    }
}
