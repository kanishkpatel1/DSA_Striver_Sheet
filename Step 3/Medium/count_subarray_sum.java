import java.util.*;
public class count_subarray_sum{
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }


    // Optimal Approach
    public static int findAllSubarraysWithGivenSum2(int arr[], int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        map.put(0,1);
        int presum=0;
        for(int i=0;i<arr.length;i++){
            presum += arr[i];
            int remove=presum-k;
            count+=map.getOrDefault(remove,0);
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        while(n-->0){
            int len=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[len];
            for(int i=0;i<len;i++){
                arr[i]=sc.nextInt();
            }
            //System.out.println("Using Bruteforce"+findAllSubarraysWithGivenSum(arr, k));
            System.out.println("Using optimal"+findAllSubarraysWithGivenSum2(arr, k));
        }

        

    }
}