import java.util.Arrays;

public class fibonacci {

    // fiboncci using extra space 
    static void  printFibonacci(int n) {
     int arr[]=new int[n+1];
     arr[0]=0;
     arr[1] = 1;
     for(int i=2;i<=n;i++){
        arr[i]=arr[i-1]+arr[i-2];
     }
     System.out.println(Arrays.toString(arr));
    }

    // fibonacci without using extra space and without recursion

    static int fibon(int n){
        if(n==0) return 0;
        int last=0;
        int secondlast=1;
        int curr=last+secondlast;
        for(int i=2;i<=n;i++){
            curr=last+secondlast;
            last=secondlast;
            secondlast=curr;
        }
        return curr;

    }
  

    // fibonacci using recursion
    static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }
    
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibo(n));
        printFibonacci(n);
        System.out.println(fibon(n));

    }
}
