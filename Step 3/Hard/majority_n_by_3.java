import java.util.*;
public class majority_n_by_3 {

    public static List<Integer> majorityElement1(int []v) {
        int n = v.length; //size of the array
        List<Integer> ls = new ArrayList<>(); // list of answers

        for (int i = 0; i < n; i++) {
            //selected element is v[i]:
            // Checking if v[i] is not already
            // a part of the answer:
            if (ls.size() == 0 || ls.get(0) != v[i] ) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    // counting the frequency of v[i]
                    if (v[j] == v[i]) {
                        cnt++;
                    }
                }

                // check if frquency is greater than n/3:
                if (cnt > (n / 3))
                    ls.add(v[i]);
            }

            if (ls.size() == 2) break;
        }

        return ls;
    }



    public static List<Integer> majorityElement2(int v[]){
            int n = v.length; //size of the array
            List<Integer> ls = new ArrayList<>(); // list of answers
            
            //declaring a map:
            HashMap<Integer, Integer> mpp = new HashMap<>();
            // least occurrence of the majority element:
            int mini = (int)(n / 3) + 1;
    
            //storing the elements with its occurnce:
            for (int i = 0; i < n; i++) {
                int value = mpp.getOrDefault(v[i], 0);
                mpp.put(v[i], value + 1);
    
                //checking if v[i] is
                // the majority element:
                if (mpp.get(v[i]) == mini) {
                    ls.add(v[i]);
                }
                if (ls.size() == 2) break;
            }
        return ls;
    }
    
    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        System.out.println(majorityElement1(arr));

        System.out.println(majorityElement2(arr));
        
    }
}
