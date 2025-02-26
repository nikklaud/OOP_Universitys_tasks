public class ValueCalculation {
    public static int maxx(int arr[]) {
        int len = arr.length;
        int maximum = arr[0];
        for (int i = 1; i < len; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }

    public static int minn(int arr[]) {
        int len = arr.length;
        int minimum = arr[0];
        for (int i = 1; i < len; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public static double mediana(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        if (len % 2 == 1) {
            return arr[len / 2];
        } else {
            return (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        }
    }
}
