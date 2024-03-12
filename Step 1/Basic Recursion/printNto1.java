

public class printNto1 {
    static void  print(int n){
        if(n<1) return;
        System.out.println(n);
        print(--n);
    }
    public static void main(String[] args) {
        int n = 9; 
        print(n);
    }
}
