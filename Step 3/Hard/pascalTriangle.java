import java.util.*;

public class pascalTriangle {
    // Variation1:  find the element at particular row and column
    // use combination rowCcolumn  to find the ans 
    public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static int var1(int r, int c) {
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }

     
    // Variation 2: Print the nth row

    // print the whole row 
    // Bruteforce solution is to run two loops and every time get element at particular row column by var1
    // Optimal to find the list using this method
    static List<Integer> var2(int n){
        List<Integer> ls=new ArrayList<>();
        int ans = 1;
        ls.add(ans);

        // Printing the rest of the part:
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            ls.add(ans);
           
        }
        return ls;
       
    }


    //Variation 3: Print the Pascal Triangle 
    // Print the each row by using var2
    static  List<List<Integer>> var3(int n){
        List<List<Integer>> ls=new ArrayList<>();
        for(int row=1;row<=n;row++){
            List<Integer>currrow=var2(row);
            ls.add(currrow);
        }
        return ls;
    }

    public static void main(String[] args) {
        int row=5;
        int col=3;
        System.out.println(var1(row, col));

        System.out.println(var2(6)); // Print nth row
        System.out.println(var3(6)); // Print the pascal triangle of row 3
    }
}
