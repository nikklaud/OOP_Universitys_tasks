package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void run(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
        System.out.println(Arrays.toString(arr));
   }
}
