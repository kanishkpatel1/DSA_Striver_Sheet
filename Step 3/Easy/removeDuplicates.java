public class removeDuplicates {
    public static  int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=1;
        
for(int i=1;i<n;i++){
    if(nums[i-1]==nums[i]){
        continue;
    }
    nums[j]=nums[i];
    j++;
}
        return j;
    }
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
