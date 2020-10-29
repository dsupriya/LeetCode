class Solution {
    public int connectSticks(int[] sticks) {
        PriorityQueue <Integer> list = new  PriorityQueue <Integer>();
        int n = sticks.length;
        for(int i=0;i<n;i++)
            list.add(sticks[i]);
        System.out.println(list);
        int ans = 0;
        while(list.size()>1)
        {
            
            
                int temp = list.poll()+list.poll();
                ans = ans + temp;
                list.add(temp);
            
            
        }
        return ans;
        
    }
}
