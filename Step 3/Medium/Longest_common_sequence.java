import java.util.*;
public class Longest_common_sequence {
    // Bruteforce approach:  
    static int find(int arr[]){
        Arrays.sort(arr);
        int res=0;
        int last=Integer.MIN_VALUE;
        int count=1;  
        for(int i=0;i<arr.length;i++){
            if(arr[i]-1==last){
                count++;
                last=arr[i];
            }
            else if(arr[i]!=last){
                count=1;
                last=arr[i];
            }
            res = Math.max(res,count);
        }
        return res;
        }

        // Better Approach
        // Use Set to store element 
        // Then for every element check el-1 is present or not and then while ele+1 present increase count
        static int find2(int arr[]){
            HashSet<Integer> set = new HashSet<>();
            int n = arr.length;
            int maxlen = 1;
            for (int i : arr) {
                set.add(i);
            }
            for (int i : arr) {
                if (!set.contains(i - 1)) {
                    int count=1;
                    int x=i;
                    while(set.contains((x + 1))) {
                        count++;
                        x++;
                    }
                    maxlen=Math.max(maxlen,count);
                }
            }
                return  maxlen;
        }
    public static void main(String[] args) {
        int arr[]={10,0,1,2,3,4,7,8,9};
        System.out.println(find(arr));
        System.out.println(find2(arr));
    }
}
