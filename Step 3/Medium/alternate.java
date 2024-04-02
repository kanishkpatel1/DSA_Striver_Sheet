import java.util.*;
public class alternate{

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
    public static void main(String[] args) {
        int arr[]={1, 2, -4, -5};
        System.out.println(Arrays.toString(alter(arr)));
    }
}