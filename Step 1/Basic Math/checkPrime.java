import java.util.*;
public class checkPrime {
    static boolean checkPrime(int n){
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    // optimize version

    static boolean checkPrime2(int n){
        if(n==1){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // System.out.println(checkPrime(n));
        System.out.println(checkPrime2(n));
    }
}
