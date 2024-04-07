import java.util.*;
public class alternate{


    // BruteForce Solution
      static int[] alter(int arr[]){
        

        int mid=arr.length/2;
        
        int res[]=new int[arr.length];
        int pos[]=new int[mid];
        int neg[]=new int[mid];
        int a=0;
        int b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                neg[a++]=arr[i];
            }
            else{
                pos[b++]=arr[i];
            }
        }
        int index=0;
        for(int i=0;i<mid;i++){
            res[index++]=pos[i];
            res[index++]=neg[i];

        }
        return res;
    }

    // Optimal Solution : Single Pass Solution
    static int[] alter2(int arr[]){
        int res[]=new int[arr.length];
        // start filling negative elements from 1 index with gap of 2
        int negative=1;
        int positive=0;
        for(int i=0;i<arr.length;i++){
         if(arr[i]<0){
            res[negative]=arr[i];
            negative+=2;
         }
         else{
            res[positive]=arr[i];
            positive+=2;
         }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, -4, -5};
        System.out.println(Arrays.toString(alter(arr)));
        System.out.println(Arrays.toString(alter2(arr)));
    }
}