package tasks;

import java.util.Arrays;

public class Task3 {
    public static void run (int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int col = 0; col < cols; col++) {
            for (int i = 1; i < rows; i++) {
                int key = matrix[i][col];
                int j = i - 1;
                while (j >= 0 && matrix[j][col] > key) {
                    matrix[j + 1][col] = matrix[j][col];
                    j--;
                }
                matrix[j + 1][col] = key;
            }
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
