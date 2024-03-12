// Bruteforce

// Traverse from 1 to min(a,b).
// And check if i is divisible by both a and b.If yes store it in the answer.
// Find the maximum value of i which divides both a and b

// public class GCDofTwo {
//     public static void main(String[] args) {
     
//         int a=20;
//         int b=5;
//         // int a=96;
//         // int b=14;
//         int ans=1;
//         for(int i=1;i<=Math.min(a,b);i++){
//             if(a%i==0 && b%i==0){
//                 ans=i;
//             }
//         }
//         System.out.println(ans);
//     }
// }

// Optimise Solution


// Solution 2: Using Euclidean’s theorem.

// Intuition: Gcd is the greatest number which is divided by both a and b.If a number is divided by both a and b, it is should be divided by (a-b) and b as well.


// Approach:

// Recursively call gcd(b,a%b) function till the base condition is hit.
// b==0 is the base condition.When base condition is hit return a,as gcd(a,0) is equal to a.

public class GCDofTwo {
   static int gcd(int a,int b){
    if(b==0){
        return  a;
    }
    return gcd(b,a%b);
   }

   public static void main(String[] args) {
    int a=20;
    int b=5;
    System.out.println(gcd(a, b));
   }
}
