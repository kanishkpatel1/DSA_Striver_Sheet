// Leetcode 152
// Bruteforce Using two loops


public class maxProduct {
    //Bruteforce
    public static int maxProduct1(int[] nums) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int m=1;
            for(int j=i;j<nums.length;j++){
                m=m*nums[j];
                ans=Math.max(m,ans);
            }
        }
        return ans;
    }


    
    // Optimal Approach 1: Using prefix and suffix calculation 
    // If the given array only contains positive numbers: If this is the case, we can confidently say that the maximum product subarray will be the entire array itself.
// If the given also array contains an even number of negative numbers: As we know, an even number of negative 
//numbers always results in a positive number. So, also, in this case, the answer will be the entire array ///
//itself.

// If the given array also contains an odd number of negative numbers: Now, an odd number of negative numbers
//  when multiplied result in a negative number. Removal of 1 negative number out of the odd number of negative 
//  numbers will leave us with an even number of negatives. Hence the idea is to remove 1 negative number from 
//  the result. Now we need to decide which 1 negative number to remove such that the remaining subarray yields 
//  the maximum product.

    public static int maxProduct2(int[] nums) {
        int pre=1;
        int suf=1;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(pre==0) pre=1;
            if(suf==0) suf=1;

            pre*=nums[i];
            suf*=nums[n-i-1];
            max=Math.max(max,Math.max(pre,suf));
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,3,-2}; //6
        System.out.println(maxProduct1(arr));
        System.out.println(maxProduct2(arr));
    }
}
