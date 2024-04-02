import java.util.ArrayList;
import java.util.HashMap;


public class findUnion {

    // find union using extra space map
    static ArrayList<Integer> FindUnionBymap(int arr1[], int arr2[], int n, int m) {
  HashMap <Integer,Integer > freq=new HashMap<>();
  ArrayList<Integer> Union=new ArrayList<>();
  for (int i = 0; i < n; i++)
    freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
    
  for (int i = 0; i < m; i++)
    freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
  for (int it: freq.keySet())
    Union.add(it);
  return Union;
}

// Using two pointer
// find union without using extra space


static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
    int i = 0, j = 0; // pointers
   ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
   while (i < n && j < m) {
     if (arr1[i] <= arr2[j]) // Case 1 and 2
     {
       if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
         Union.add(arr1[i]);
       i++;
     } else // case 3
     {
       if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
         Union.add(arr2[j]);
       j++;
     }
   }
   while (i < n) // IF any element left in arr1
   {
     if (Union.get(Union.size()-1) != arr1[i])
       Union.add(arr1[i]);
     i++;
   }
   while (j < m) // If any elements left in arr2
   {
     if (Union.get(Union.size()-1) != arr2[j])
       Union.add(arr2[j]);
     j++;
   }
   return Union;
 }

public static void main(String args[]) {
  int n = 10, m = 7;
  int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int arr2[] = {2, 3, 4, 4, 5, 11, 12};
  System.out.println(FindUnionBymap(arr1, arr2, n, m));
  System.out.println(FindUnion(arr1, arr2, n, m));
}
}
