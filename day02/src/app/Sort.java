package app;

public class Sort {
    public static void insertSort(int[] a) {
        // {1,3,2,5,7,3,8,5};
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = a[i];
            while (temp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    public static void selectSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int index = i;
            int min = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                if (a[j] < min) {
                    min = a[j];
                    index = j;
                }
            }
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }

    }
}