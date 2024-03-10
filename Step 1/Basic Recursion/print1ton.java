

public class print1ton {
    
    static void  print(int i,int n){
        if(i>n) return;
        System.out.println(i);
        print(++i, n);
    }
    public static void main(String[] args) {
        int n = 9; 
        print(1,n);
    }
}
