// Solution 1: (Brute Force) [this approach only works if there are no duplicates]

import java.util.*;

public class second_large_element {
    static private void getElements(int[] arr, int n)
   {
	if (n == 0 || n==1)
	{
		System.out.print(-1);
		System.out.print(" ");
		System.out.print(-1);
		System.out.print("\n");
	}
	Arrays.sort(arr);
	int small = arr[1];
	int large = arr[n - 2];
	System.out.println("Second smallest is "+small);
	System.out.println("Second largest is "+large);
}

// Better Approach
static void getelem(int arr[],int n){
    if (n == 0 || n==1)
	{
		System.out.print(-1);
		System.out.print(" ");
		System.out.print(-1);
		System.out.print("\n");
	}

    int max=Integer.MIN_VALUE;
    int secmax=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int secmin=Integer.MAX_VALUE;
    
    for(int i=0;i<arr.length;i++){
        min=Math.min(min, arr[i]);
        max=Math.max(max, arr[i]);
    }

    for(int i=0;i<arr.length;i++){
        if(arr[i]>secmax  && arr[i]!=max){
            secmax=arr[i];
          
        }
        if(arr[i]<secmin && arr[i]!=min){
            
            secmin=arr[i];
       
        }
    }

    System.out.println("Second smallest is "+secmin);
	System.out.println("Second largest is "+secmax);
}




// Optimal Approach
static void betterget(int arr[],int n){
    if(n<2) {System.out.println("-1 -1"); return;} // If array has less than two elements, print "-1" as both
    // Find the minimum and maximum element in
    int max=Integer.MIN_VALUE;
    int secmax=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int secmin=Integer.MAX_VALUE;

    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            secmax=max;
            max=arr[i];
          
        }
        else if(arr[i]>secmax && arr[i]!=max){
            secmax=arr[i];
        }
        if(arr[i]<min){
            
            secmin=min;
            min=arr[i];
       
        }
        else if(arr[i]<secmin && arr[i]!=min) {
            secmin=arr[i];
        }

    }

    System.out.println("Second smallest is "+secmin);
	System.out.println("Second largest is "+secmax);
}

public static void main(String[] args)
{
	int[] arr = {1, 2, 4, 6, 7, 5,8};
	int n = arr.length;
	getElements(arr, n);
    getelem(arr, n);
    betterget(arr, n);
}
}
