class Solution {
    public String minWindow(String s, String t) {
        HashMap <Character,Integer> hm = new HashMap <Character,Integer> ();
        HashMap <Character,Integer> window =  new HashMap <Character,Integer> ();
        int m = t.length();
        int temp;
        for(int i=0;i<m;i++)
        {
            char ch = t.charAt(i);
            temp = hm.getOrDefault(ch,0);
            hm.put(ch,temp+1);
        }
        //System.out.println(hm);
        int l,r,minl,minr,min;
        l=r=minl=minr=0;
        min = Integer.MAX_VALUE;
        int cur,req;
        req = hm.size();
        cur = 0;
        //System.out.println("req" + req);
        while(r<s.length())
        {
            char ch =  s.charAt(r);
            temp = window.getOrDefault(ch,0);
            window.put(ch,temp+1);
            if(hm.containsKey(ch))
            {
                if(hm.get(ch).intValue()==window.get(ch).intValue())
                    cur++;
            }
            while(cur == req && l<=r)
            {
                //System.out.println(cur +"*** "+req);
                if(r-l+1 < min)
                {
                    //System.out.println(l);
                    minl = l;
                    minr = r;
                    min = r-l+1;
                }
                char leftChar = s.charAt(l);
                window.put(leftChar,window.get(leftChar)-1);
                if(hm.containsKey(leftChar))
                {
                    if(hm.get(leftChar).intValue()>window.get(leftChar).intValue())
                        cur--;
                }
                l++;
            }
            r++;
        }
        
        return min == Integer.MAX_VALUE ? "" : s.substring(minl,minr+1);
    }
}
