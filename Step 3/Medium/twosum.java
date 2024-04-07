import java.util.*;

public class twosum {
    // BruteForce Approaches ------------------------------>
    static boolean twoSum(int n, int arr[], int target) {

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;
    }

    // variant two return the index whose sum is equal to the k
    static int[] twoSum2(int n, int arr[], int target) {

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 };
    }

    // Optimization Using map-------------------->

    static int[] twoSum2_optimize(int n, int arr[], int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int diff = target - arr[i];
            if (mp.containsKey(diff))
                return new int[] { mp.get(diff), i };
            mp.put(arr[i], i); /* Store the element and its Index */

        }
        return new int[] { -1, -1 };
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        boolean ans = twoSum(n, arr, target);
        int res[] = twoSum2(n, arr, target);
        int res2[] = twoSum2_optimize(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
        System.out.println("This is the answer for variant 2: " + Arrays.toString(res));
        System.out.println("This is the optimze answer for variant 2: " + Arrays.toString(res2));
    }
}
