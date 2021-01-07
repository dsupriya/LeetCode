class Solution {
    public String minWindow(String s, String t) {
        
        int target_length = t.length();
        int str_length = s.length();
        if(target_length > str_length)
            return "";
        HashMap <Character,Integer> target = new HashMap();
        HashMap <Character,Integer> window = new HashMap();
        int count, req;
        count = req = 0;
        for(int i=0;i<t.length();i++)
        {
            count = target.getOrDefault(t.charAt(i),0);
            target.put(t.charAt(i),count+1);
        }
        System.out.println(target);
        char cur;
        int l,r;
        l=r=0;
        int min = Integer.MAX_VALUE;
        int left,right;
        left=right=0;
        while(l<str_length && r<str_length)
        {
            cur = s.charAt(r);
            count = window.getOrDefault(cur,0);
            window.put(cur,count+1);
            if(target.containsKey(cur))
            {
                if(window.get(cur).intValue()==target.get(cur).intValue())
                    req++;
            }
            while(req==target.size() && l<=r)
            {
                //System.out.println(req+" "+target.size());
                if(min>r-l+1)
                {
                    min = r-l+1;
                    left = l;
                    right = r;
                }
                char left_char = s.charAt(l);
                count = window.get(left_char);
                window.put(left_char,count-1);
                if(target.containsKey(left_char))
                {
                    if(target.get(left_char)>window.get(left_char))
                        req--;
                }
                 l++;
            }
            r++;
           
                
            
        }
        String a = "";
        a = min == Integer.MAX_VALUE ?  "" : s.substring(left,right+1);
        return a;
    }
}
