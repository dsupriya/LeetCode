class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap <Integer,Cell> hm = new HashMap();
        Cell cur;
        for(int i=0;i<nums.length;i++)
        {
            cur = hm.getOrDefault(nums[i],new Cell(0,i,i));
            cur.updateCount(cur.count+1);
            cur.updateEnd(i);
            hm.put(nums[i],cur);
            
            
        }
        int f,ans;
        f = Integer.MIN_VALUE;
        ans = Integer.MAX_VALUE;
        int a;
        for(Map.Entry e : hm.entrySet())
        {
            a = (Integer) e.getKey();
            cur = (Cell) e.getValue();
            int length = cur.end - cur.start+1;
            if(f==cur.count)
            {
                if(ans>=length)
                    ans = length;
            }
            else if(f<cur.count)
            {
                f = cur.count;
                ans = length;
            }
        }

        //System.out.println(hm);
        return ans;
        
    }
}
class Cell
{
    Integer count,start,end;
    Cell(int a, int b , int c)
    {
        this.count = a;
        this.start = b;
        this.end = c;
    }
    public Cell updateCount(int c)
    {
        this.count = c;
        return this;
    }
    public Cell updateEnd(int c)
    {
        this.end = c;
        return this;
    }
}
