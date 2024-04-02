public class getSingleelement{

    static int getSingleElement(int arr[]){
        int x=0;
        for(int i=0;i<arr.length;i++){
            x=x^arr[i];
        }
        return x;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }
}