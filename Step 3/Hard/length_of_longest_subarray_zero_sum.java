import java.util.HashMap;

public class length_of_longest_subarray_zero_sum {
// Bruteforce : 
    
static int solve(int[] a){
	int  max = 0;
	for(int i = 0; i < a.length; ++i){
		int sum = 0;
		for(int j = i; j < a.length; ++j){
			sum += a[j];
			if(sum == 0){
				max = Math.max(max, j-i+1);
			}
		}
	}
	return max;
   }

   // Optimal Solution 
   static int solve2(int[] a){
	 
    int n=a.length;
    {
        // Your code here
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0; 

        for(int i = 0;i<n;i++) {

            sum += a[i]; 
            // at any point we get sum ==0 then add it in answer 
            if(sum == 0) {
                maxi = i + 1; 
            }
            else { // if current sum is present in the map already 
				// then it means that values between  the index where it already present and current present is 0 
				// so get the index between current index and that index and add it to the answer
                if(mpp.get(sum) != null) {
                 
                    maxi = Math.max(maxi, i - mpp.get(sum)); 
                }
                else {
                    // if the current sum is not present in the map add it to the map with index 
                    mpp.put(sum, i); 
                }
            }
        }
        return maxi; 
    }
}



    public static void main(String args[]) 
    { 
        int a[] = {9, -3, 3, -1, 6, -5};
        System.out.println(solve(a));
		System.out.println(solve2(a));
    } 
}
