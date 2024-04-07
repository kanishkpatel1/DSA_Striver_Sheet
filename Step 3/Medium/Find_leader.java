import java.util.*;
public class Find_leader {
    
    public static List< Integer > superiorElements(int []a) {
        List<Integer> ls=new ArrayList<>();
        int max=a[a.length-1];
        ls.add(0,max);
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>max){
                ls.add(0,a[i]);
                max=a[i];
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        int arr[]={10, 22, 12, 3, 0, 6};
        System.out.println(superiorElements(arr));
    }
}
