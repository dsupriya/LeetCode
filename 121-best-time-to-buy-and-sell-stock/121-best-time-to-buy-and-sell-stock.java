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

/* At each day, we take a decision [buy, sell]
we buy , if cur is < min, i.e. this is the minimum price we have found so far
we sell, if cur > than min
*/