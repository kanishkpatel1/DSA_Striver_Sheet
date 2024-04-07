public class Buy_Sell_stocks {
    // BruteForce Approach
    public static int maxProfit1(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                maxProfit=Math.max(maxProfit,prices[j]-prices[i]);
            }
        }
        return maxProfit;
    }

    // Better Approach : 
    // check min and max every iteration
    public static int maxProfit2(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            profit=Math.max(profit,prices[i]-buy);
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit1(arr));
        System.out.println(maxProfit2(arr));
    }
}
