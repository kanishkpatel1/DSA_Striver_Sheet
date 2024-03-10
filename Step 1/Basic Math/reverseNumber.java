public class reverseNumber{
    public static void main(String[] args) {
        int n=54321245;
        int revnumb=0;
        while(n>0){
           revnumb=revnumb*10+n%10;
           n=n/10;
        }
        
        System.out.println(revnumb);
    }
}