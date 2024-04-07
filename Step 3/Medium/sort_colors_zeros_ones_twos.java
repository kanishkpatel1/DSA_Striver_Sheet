import java.util.*;
// Approach 1: We can directly sort the array and return 
// Approach 2: since we have only three value so use counting sort to sort the array

// Approach 3: This problem is a variation of the popular Dutch National flag algorithm. 


// The steps will be the following:

// First, we will run a loop that will continue until mid <= high.
// There can be three different values of mid pointer i.e. arr[mid]
// If arr[mid] == 0, we will swap arr[low] and arr[mid] and will increment both low and mid. Now the subarray from index 0 to (low-1) only contains 0.
// If arr[mid] == 1, we will just increment the mid pointer and then the index (mid-1) will point to 1 as it should according to the rules.
// If arr[mid] == 2, we will swap arr[mid] and arr[high] and will decrement high. Now the subarray from index high+1 to (n-1) only contains 2.
// In this step, we will do nothing to the mid-pointer as even after swapping, the subarray from mid to high(after decrementing high) might be unsorted. So, we will check the value of mid again in the next iteration.
// Finally, our array should be sorted.


public class sort_colors_zeros_ones_twos {

    static void sort(int arr[]){
        int start=0,mid=0;
        int end=arr.length-1;
        while(mid<=end){
            if(arr[mid]==0){
                int temp=arr[start];
                arr[start]=arr[mid];
                arr[mid]=temp;
                start++;
                mid++;
            } else if (arr[mid]==1) {

                mid++;
            } else if (arr[mid]==2) {
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0, 2, 1, 2, 0, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
