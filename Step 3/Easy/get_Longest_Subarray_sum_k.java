import java.util.*;
public class get_Longest_Subarray_sum_k {

    // get subarray using bruteforce generate all the subarrays
    static int getLongestSubarray(int arr[],long k){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++) {
                sum += arr[j];
                if(sum==k){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }

    // Optimal Approach
    // get longest subarray using map
    static int longestSubarray(int arr[],int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = arr.length ;
        int res=0;
        map.put(0,1);
        int presum=0;
        for(int i=0;i<arr.length;i++){
            presum+=arr[i];
            if(presum == k) 
                res = Math.max(res,i + 1);
            
            int rem=presum-k;
            if (map.containsKey(rem)) {
                res = Math.max(res,i - map.get(rem));
            }
            if(!map.containsKey(presum)){
            map.put(presum,i);}
        }
        
        return res;


        }


    





    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len1 = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len1);
        int len2 = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len2);
    }
}
