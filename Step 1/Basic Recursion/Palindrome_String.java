public class Palindrome_String{

    static boolean check(int i,String str){
        if(i>=str.length()) return true;  // if i exceed half  of the string length then it is palindrome
        if(str.charAt(i) != str.charAt(str.length()-1-i)) return false;
        return check(i+1,str);
    }

    public static void main(String[] args) {
        String str="aba";
        System.out.println(check(0,str));
    }
}