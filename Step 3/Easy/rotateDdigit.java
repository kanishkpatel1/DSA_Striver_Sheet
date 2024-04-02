import java.util.*;

import javax.lang.model.util.Elements;
public class rotateDdigit {
    // rotate using temp array
    static void temprotate(int nums[],int k){
       
                int n=nums.length;
                k=k%n;
                int b=n-k;
                int[] arr=new int[n];
                int a=0;
                for(int i=b;i<n;i++){
                    arr[a++]=nums[i];
                }
                for(int i=0;i<b;i++){
                    arr[a++]=nums[i];
                }
                for(int i=0;i<n;i++){
                    nums[i]=arr[i];
                }
       
    }



// Approach 2: Using ” Reversal Algorithm “

// Approach:

// For Rotating Elements to right
// Step 1: Reverse the last k elements of the array

// Step 2: Reverse the first n-k elements of the array.

// Step 3: Reverse the whole array.

public static void Reverse(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  // Function to Rotate k elements to right
  public static void rotaterev(int[] arr, int n, int k) {
    // Reverse first n-k elements
    Reverse(arr, 0, n - k - 1);
    // Reverse last k elements
    Reverse(arr, n - k, n - 1);
    // Reverse whole array
    Reverse(arr, 0, n - 1);
  }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int arr2[]={1,2,3,4,5,6,7};
        int k=3;
        temprotate(arr, k);
        System.out.println(Arrays.toString(arr));
        rotaterev(arr2, arr2.length, k);
        System.out.println(Arrays.toString(arr2));
    }
}
