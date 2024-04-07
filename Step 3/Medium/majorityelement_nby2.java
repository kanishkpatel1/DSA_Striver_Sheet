// BruteForce : we can calculate it by run two loops then check 
// if it present more than n/2 times then return true otherwise false

// Better Approach: Use hashmap to store freq 

// Optimal Approach
// Moore's Voting Algorithm
// 
// Initialize 2 variables:
// Count –  for tracking the count of element
// Element – for which element we are counting
// Traverse through the given array.
// If Count is 0 then store the current element of the array as Element.
// If the current element and Element are the same increase the Count by 1.
// If they are different decrease the Count by 1.
// The integer present in Element should be the result we are expecting

// dry run this you will get the logic
public class majorityelement_nby2 {
    static int check(int arr[]){
        int n=arr.length;

        int count=0;
        int element=0;       
        for (int i =  0; i < n; i++) {
            if(count==0) {
                count++; 
                element=arr[i];
            } 
            else if(element==arr[i]) count++;
            else count--;
        }
        // check the selected element really appears n/2 or not
        int f=0;
        for(int i=0;i<n;i++){
            if(arr[i]==element) f++;
        }
        if(f>n/2) return element;
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2, 2, 1, 1,3,3,3,3,3,3,3,3, 1, 2, 2};
        System.out.println(check(arr));

    }
}
