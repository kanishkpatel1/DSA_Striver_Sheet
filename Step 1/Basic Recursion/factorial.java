public class factorial {
       // method 1   using recursion
       static int fact(int n){
        if(n==1) return 1;
        return n*fact(--n);
        }

    // method 2 using recursion
    static void bfact(int i,int n){
        if(n<1) {
            System.out.println(i);
            return ;
        }
        bfact(i*n, --n);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(fact(n));
        bfact(1, n);
    }
}
