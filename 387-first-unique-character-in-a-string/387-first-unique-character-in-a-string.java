class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character ,Integer> hm = new HashMap();
        char c;
        int count;
        
        for(int i = 0;i<s.length();i++)
        {
            c = s.charAt(i);
            count = hm.getOrDefault(c,0);
            hm.put(c,count+1);
        }
        for(int i =0;i<s.length();i++)
        {
            c = s.charAt(i);
            if(hm.get(c)==1)
                return i;
        }
        return -1;
        
    }
}