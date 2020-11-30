class Solution {
    public int countLetters(String s) {
        int n = s.length();
        int []dp = new int[n];
        dp[0] = 1;
        int sum = 1;
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                dp[i] = 1+dp[i-1];
            }
            else
                dp[i] = 1;
            sum = sum+dp[i];
        }
        return sum;
        
        
    }
}
