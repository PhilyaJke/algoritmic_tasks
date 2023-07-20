import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int indexBuy = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i+1]-prices[i]>=prices[i+1]-prices[indexBuy]) {
                indexBuy = i;
            }
            if(prices[i + 1] - prices[indexBuy]>profit){
                profit = prices[i + 1] - prices[indexBuy];
            }
        }
        return profit;
    }
}
