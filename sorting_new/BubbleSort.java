package sorting_new;

public class BubbleSort {
    public static void bubbleSort(int a[]) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }
        for (int k = 0; k < n; k++)
            System.out.println(a[k]);
    }

    public static void main(String args[]) {
        int[] a = { 5, 4, 1, 8, 2, 10, 3, 3000, 5000, 1200, 8000 };
        BubbleSort.bubbleSort(a);
    }

}
