package sorting_new;

public class selectionsort {

    public static void selectionSort(int a[]) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int pos = i;
            for (int j = i + 1; j < n; j++) {
                if (a[pos] > a[j]) {
                    pos = j;
                }

            }

            int temp = a[pos];
            a[pos] = a[i];
            a[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 1, 4, 8, 2, 10, 3 };

        selectionsort.selectionSort(a);
    }

}
