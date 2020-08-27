class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ans = -1;
        int n = gas.length;
        for(int i=0;i<n;i++)
        {
            if(cost[i]<=gas[i])
            {
                ans = solve(i,gas,cost);
                if(ans!=-1)
                    return ans;
            }
        }
        return ans;
    }
    public static int solve(int start, int []gas, int []cost)
    {
        int count = 0;
        int n = gas.length;
        int ans = -1;
        int total = 0;
        int i = start;
        while(count<n)
        {
            total = total+gas[i]-cost[i];
            if(total<0)
                return -1;
            i++;
            if(i==n)
                i=0;
            count++;
            
        }
        return start;
    }
}
