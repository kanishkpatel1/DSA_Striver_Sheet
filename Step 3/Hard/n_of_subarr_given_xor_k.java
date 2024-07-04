import java.util.*;
public class n_of_subarr_given_xor_k {
    static int subarraysWithXorK(int a[],int k){
        int count=0;
        for(int i=0;i<a.length;i++){
            int xor=0;
            for(int j=i;j<a.length;j++){
                xor=xor^a[j];
                if(xor==k){ count++; }
            }
        }
        return count;
    }

    // Optimal Approach Using Hashing
    static int subarraysWithXorK2(int arr[],int k){
        Map<Integer,Integer> map=new HashMap<>();
        int xr=0;
        int count=0;
        map.put(xr,1); //store 0 for first occ


        for(int i=0;i<arr.length;i++){
             xr=xr^arr[i];
           int x=xr^k;
           if(map.containsKey(x)) count+=map.get(x);
           map.put(xr,map.getOrDefault(xr,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        int ans2=subarraysWithXorK2(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
        System.out.println(ans2);
    }
}
