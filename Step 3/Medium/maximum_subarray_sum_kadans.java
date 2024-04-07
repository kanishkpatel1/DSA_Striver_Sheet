// kadanes algo : maximum  sum of subarray with at most K distinct elements

public class maximum_subarray_sum_kadans{
    // Bruteforce approach: 
    // find max sum for every subarray 
    public static int find1(int arr[]){
        int res=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                // calculate max here because it might be possible to negative number in next iteration
                res=Math.max(res,sum);
            }
            
        }
        return res;
    }

    //Better Approach:  we can find the ans in O(N) calculate max every time 
    //and when sum value decreases than 0 then put it to 0
    public static int find2(int arr[]){
        int res=0;
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            res=Math.max(res,sum);
            if(sum<0) sum=0;
        }
        return res;
    }


    // Follow up question: 
    // If we ask to print the subarray also which gives us maximum sum print any subarray  with the max sum

    public static int find3(int arr[]){
        int res=0;
        int sum=0;
        int start=-1;
        int end=-1;
        for(int i=0;i<arr.length;i++) {
            if(sum==0){
                start=i;
            }
            sum+=arr[i];
           
            if(sum>res){
                end=i;
                res=Math.max(sum,res);
            }
            if(sum<0) {
                sum=0;
                
            }
           
        }
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return res;
    }
    public static void main(String[] args) {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(find1(arr));
        System.out.println(find2(arr));
        System.out.println(find3(arr));
        int arr2[]={5,4,-1,7,8};
        System.out.println(find3(arr2));
    }
}