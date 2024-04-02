import java.util.Arrays;

public class moveZeroesend {
    // Bruteforce approach with extra space
    public static int[] moveZeroesspc(int[] nums) {

        // pahle pure array ko ek array me copy krlo 
        // fir do variable bnake ek start ke liye aur ek end ke liye
        // agr value 0 hai to end se fill krte huye liye aao original array ko
        // agr value 1 hai to start se fill krte huye liye aao bs 
        int n=nums.length;
     
        int arr[]=new int[n];
           for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }


        int c=0,d=n-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
            nums[d]=arr[i];
                d--;
            }
            else{
                nums[c]=arr[i];
                c++;
            }
        }
        return nums;
        
    }

    // Optimal approach without using extra space
    public static int[] moveZeros (int n,int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1) return nums; // no zero in the array
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(arr.length, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(moveZeroesspc(ans)));
    }
}
