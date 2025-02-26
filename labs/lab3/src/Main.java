import java.util.*;

public class Main {
    public static void main(String[] args) {
        // --- Задание 3.1.1 ---
        int[] array = {3, 1, 5, 1, 7, 5, 7};
        findMinMax(array);

        // --- Задание 3.1.2 ---
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 чисел:");
        int[] inputArray = new int[5];
        for (int i = 0; i < 5; i++) {
            inputArray[i] = scanner.nextInt();
        }
        System.out.println("Медиана: " + findMedian(inputArray));

        // --- Задание 3.1.4 ---
        int[][] matrix = {
                {3, 5, 1},
                {7, 9, 4},
                {2, 8, 6}
        };
        processMatrix(matrix);

        // --- Задание 3.2 ---
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        processString(text);
    }

    // --- Метод для поиска мин/макс элементов массива (Задание 3.1.1) ---
    public static void findMinMax(int[] array) {
        int min = Arrays.stream(array).min().orElseThrow();
        int max = Arrays.stream(array).max().orElseThrow();
        System.out.println("Минимальные элементы: " + findAllOccurrences(array, min));
        System.out.println("Максимальные элементы: " + findAllOccurrences(array, max));
    }

    public static List<Integer> findAllOccurrences(int[] array, int value) {
        List<Integer> occurrences = new ArrayList<>();
        for (int num : array) {
            if (num == value) {
                occurrences.add(num);
            }
        }
        return occurrences;
    }

    // --- Метод для нахождения медианы (Задание 3.1.2) ---
    public static double findMedian(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }

    // --- Метод пузырьковой сортировки (Задание 3.1.3) ---
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // --- Метод обработки матрицы (Задание 3.1.4) ---
    public static void processMatrix(int[][] matrix) {
        int n = matrix.length;
        int maxOnMainDiagonal = Integer.MIN_VALUE;
        int sumMainDiagonal = 0, sumAntiDiagonal = 0;

        for (int i = 0; i < n; i++) {
            sumMainDiagonal += matrix[i][i];
            sumAntiDiagonal += matrix[i][n - 1 - i];
            maxOnMainDiagonal = Math.max(maxOnMainDiagonal, matrix[i][i]);
        }

        System.out.println("Максимальный элемент на главной диагонали: " + maxOnMainDiagonal);
        System.out.println("Сумма элементов на главной диагонали: " + sumMainDiagonal);
        System.out.println("Сумма элементов на обратной диагонали: " + sumAntiDiagonal);
    }

    // --- Обработка строки (Задание 3.2) ---
    public static void processString(String text) {
        System.out.println("Последний символ: " + text.charAt(text.length() - 1));
        String[] sentences = text.split("[.!?]\s*");
        System.out.println("Предложения: " + Arrays.toString(sentences));
        System.out.println("Количество предложений: " + sentences.length);
        System.out.println("Начинается ли строка с 'Lorem ': " + text.startsWith("Lorem "));
    }

    // --- Методы работы с текстом и массивами (Задание 3.3) ---
    public static int countWords(String text) {
        return text.split("\\s+").length;
    }

    public static double average(int[] array) {
        return Arrays.stream(array).average().orElse(0);
    }

    public static int[] findMinMaxValues(int[] array) {
        int min = Arrays.stream(array).min().orElseThrow();
        int max = Arrays.stream(array).max().orElseThrow();
        return new int[]{min, max};
    }
}
