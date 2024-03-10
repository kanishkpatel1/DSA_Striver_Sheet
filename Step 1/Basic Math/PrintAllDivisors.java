import java.util.*;

public class PrintAllDivisors {
     public static List< Integer > printDivisors1(int n) {
        List<Integer> ls=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ls.add(i);
            }
        }
        return ls;
    }
    // Optimal Solution 

    // for 36
    // 1*36=36
    // 2*18
    // 3*12
    // 4*9
    // 6*6

    // so total divisors be 1,2,3,4,6,9,12,18,36 

    // so traverse to the sqrt of num and check for duplicate if i is equal to the num/i
    public static List< Integer > printDivisors(int n) {
        List<Integer> ls=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                ls.add(i);

                if(i!=n/i){
                    ls.add(n/i);
                }
            }
        }
        Collections.sort(ls);
        return ls;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(printDivisors(n));
    }
}
