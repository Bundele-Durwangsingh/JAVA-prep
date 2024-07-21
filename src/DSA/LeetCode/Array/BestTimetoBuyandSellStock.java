package DSA.LeetCode.Array;

public class BestTimetoBuyandSellStock {
    /**
     * Approach:
     * This solution finds the maximum profit that can be achieved from buying and selling stock
     * on different days. It uses a single pass to track the minimum price encountered so far 
     * and calculates the profit by subtracting this minimum price from the current price.
     * If this profit is higher than the previously recorded maximum profit, it updates the maximum profit.
     * 
     * Explanation:
     * 1. Iterate through the price array.
     * 2. Track the minimum price seen so far.
     * 3. Calculate the profit by subtracting the current price from the minimum price.
     * 4. Update the maximum profit if the calculated profit is higher.
     * 5. Return the maximum profit.
     */
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        // int[] prices = {7, 6, 4, 3, 1};
        int maxProfit = calculateMaxProfit(prices);
        System.out.println("The maximum profit is: " + maxProfit);
    }

    public static int calculateMaxProfit(int[] prices) {
        // If prices array is null or has less than 2 elements, return 0 as no profit can be made
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE; // Initialize minPrice to the maximum possible value
        int maxProfit = 0; // Initialize maxProfit to 0

        // Iterate through the prices array
        for (int i = 0; i < prices.length; i++) {
            // If the current price is less than the recorded minPrice, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            // If the profit from the current price and minPrice is greater than maxProfit, update maxProfit
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        // Return the maximum profit calculated
        return maxProfit;
    }
}
