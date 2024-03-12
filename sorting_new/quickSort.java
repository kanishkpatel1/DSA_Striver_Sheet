package sorting_new;

public class quickSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element
        int pidx = partition(arr, si, ei);
        quicksort(arr, si, pidx - 1);// left
        quicksort(arr, pidx + 1, ei);// right

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;// to make place for els smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;

                // swap
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        i++;

        int t = pivot;
        arr[ei] = arr[i];
        arr[i] = t;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 30, 50, 20, 90, 70 };
        quicksort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
