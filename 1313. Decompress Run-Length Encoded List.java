class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        int f,v;
        f=v=0;
        String s="";
        char c;
        ArrayList <Integer> l = new ArrayList <Integer>();
        for(int i=0;i<n;i=i+2)
        {
            f=nums[i];
            v=nums[i+1];
            for(int j=0;j<f;j++)
                l.add(v);
        }
        //System.out.println(s);
        n=l.size();
        int ans[] = new int [n];
        Iterator itr = l.iterator();
        int i=0;
        while(itr.hasNext())
        {
            ans[i] = (int)itr.next();
            i++;
        }
        return ans;
    }
}
