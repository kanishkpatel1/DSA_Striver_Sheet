

public class Sum_of_n_numbers {

    // method 1   using recursion
    static int sum(int n){
        if(n==0) return 0;
        return n+sum(--n);
        }

    // method 2 using recursion
    static void bsum(int i,int n){
        if(n<1) {
            System.out.println(i);
            return ;
        }
        bsum(i+n, --n);
    }
    // method 3 using formula 
    static int csum(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
        bsum(0, n);
        System.out.println(csum(n));
    }
}
