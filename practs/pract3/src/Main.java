import tasks.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String name = "Титов Никита";
        Scanner scanner = new Scanner(System.in);
        char[] arr = {'a', 'v', 'b', 's', 'r', 'f', 'k', 'l', 'o'};
        int[][] matrix = {
                {5, 3, 9},
                {1, 6, 4},
                {7, 2, 8}
        };
        int[] mas = {3343, 767, 877, 7877, 9};
        while (true) {
            System.out.println("\nВыберите задачу:");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("0. Выход");
            System.out.print("Введите номер задачи: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println(name);
                    Task1.run(arr);
                } case 2 -> {
                    System.out.println(name);
                    Task2.run(arr);
                } case 3 -> {
                    System.out.println(name);
                    Task3.run(matrix);
                } case 4 -> {
                    System.out.println(name);
                    Task4.run(mas);
                } case 5 -> {
                    System.out.println(name);
                    Task5.run(mas);
                } case 0 -> {
                    scanner.close();
                    return;
                }
            }
        }
    }
}