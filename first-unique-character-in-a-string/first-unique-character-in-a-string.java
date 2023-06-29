class Solution {
    public int firstUniqChar(String s) {
        
        HashMap <Character,Integer> hm = new HashMap();
        int n = s.length();
        
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            int count = hm.getOrDefault(ch,0);
            hm.put(ch,count+1);
        }
        int ans = -1;
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            int count = hm.get(ch);
            if(count == 1)
                return i;
            
        }
        return ans;
        
    }
}