package sorting_new;

public class Insertion_sort {

    public static void insertionSort(int a[]) {

        int n = a.length;
        for (int i = 0; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && key < a[j]) {
                a[j + 1] = a[j];

                j = j - 1;
            }
            a[j + 1] = key;
        }

        for (int k = 0; k < n; k++) {
            System.out.println(a[k]);
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 4, 1, 8, 2, 10, 3 };

        Insertion_sort.insertionSort(a);
    }

}
