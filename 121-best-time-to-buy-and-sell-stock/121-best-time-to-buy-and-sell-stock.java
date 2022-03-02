class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int max = Integer.MIN_VALUE;
        int min = 0;
        
        for(int i=1; i<n; i++)
        {
            if(prices[i] > prices[min])
            {
                max = Math.max(max, prices[i] - prices[min]);
            }
            else
            {
                min = i;
            }
        }
        
        return max == Integer.MIN_VALUE  ? 0 : max;
            
        
        
    }
}