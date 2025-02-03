import tasks.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String name = "Титов Никита";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВыберите задачу:");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("0. Выход");
            System.out.print("Введите номер задачи: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println(name);
                    Task1.run();
                } case 2 -> {
                    System.out.println(name);
                    Task2.run();
                } case 3 -> {
                    System.out.println(name);
                    Task3.run();
                } case 4 -> {
                    System.out.println(name);
                    Task4.run();
                } case 5 -> {
                    System.out.println(name);
                    Task5.run();
                } case 6 -> {
                    System.out.println(name);
                    Task6.run();
                } case 7 -> {
                    System.out.println(name);
                    Task7.run();
                } case 0 -> {
                    scanner.close();
                    return;
                }
            }
        }
    }
}
