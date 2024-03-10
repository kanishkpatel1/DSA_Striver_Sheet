// armstrong no = sum of all its digits to the power  equal to the number of digits.

// for example, if a number is 153, then it's an armstrong number because:
// 1^3 + 5^3 + 3^3 = 153 which is equal to 153.
// example  2 : 9474
// here 9^4 + 4^4 + 7^4 +  4^4 = 9474 which is also equal to 9474 so it’s another type of Armstrong number.
public class ArmstrongNumber {
    static boolean armstrong(int n){
        int pow=0;
        int temp=n;
        while(temp!=0){
            pow++;
            temp/=10;
        }
        int res=0;
        temp=n;
        while (n!=0) {
            res+=Math.pow(n%10,pow);
            n/=10;
        }
        
       return res==temp;
       
    }
    public static void main(String[] args) {
        int n=153;
        System.out.println(armstrong(n));
    }
}
