class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String [] a = A.split(" ");
        String [] b = B.split(" ");
        HashMap <String,Integer> hm = new HashMap();
        String cur;
        int count = 0;
        for(int i=0;i<a.length;i++)
        {
            cur = a[i];
            count = hm.getOrDefault(cur,0);
            hm.put(cur,count+1);
            
        }
        for(int i=0;i<b.length;i++)
        {
            cur = b[i];
            count = hm.getOrDefault(cur,0);
            hm.put(cur,count+1);
            
        }
        ArrayList <String> ans = new ArrayList();
        for(Map.Entry e : hm.entrySet())
        {
            if((int)e.getValue()==1)
                ans.add((String)e.getKey());
        }
        String [] res = new String[ans.size()];
        int i = 0;
        for(String str : ans)
        {
             res[i] = str;
            i++;
            
        }
        return res;
           
    
    }
}
