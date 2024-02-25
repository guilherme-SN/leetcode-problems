public class Problem121 {

    public int maxProfit(int[] prices) {

        int buy = 0;
        int sell = 1;
        int maxProf = 0;

        while (sell < prices.length) {

            if (prices[sell] - prices[buy] > 0) {

                int profit = prices[sell] - prices[buy];
                maxProf = (profit > maxProf) ? profit : maxProf;
            } else {

                buy = sell;
            }

            sell++;
        }
        
        return maxProf;
    }
}
