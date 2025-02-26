public class SortValues {
    public static int[] choose(int arr[]) {

        int len = arr.length;
        for (int i = 0; i < len - 1; i++){
            int minn = i + 1;
            for (int j = i + 1; j < len; j++){
                if (arr[j] < arr[minn]){
                    minn = j;
                }
            }
            if (arr[minn] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[minn];
                arr[minn] = temp;
            }
        }

        return arr;
    }

    public static int[] insert(int arr[]) {

        int len = arr.length;
        for (int i = 0; i < len; i++){
            for (int j = i; j > 0; j--){
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        return arr;
    }
}
