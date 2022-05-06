/*
Bruet Force
class Solution {
    public String removeDuplicates(String str, int k) {
        StringBuilder s = new StringBuilder(str);
        int start,end,window;
        
        start = end = window = 0;
        
        for(; end<s.length() && start<=end; end++)
        {
            if(start==end)
                continue;
            if(s.charAt(start)!=s.charAt(end))
                start = end;
            if(s.charAt(start)==s.charAt(end))
            {
                window = end-start+1;
                if(window==k)
                {
                    s.replace( start,end+1,"");
                    start =0;
                    end=0;
                }
            }
        }
        return new String(s);
        
    }
}*/


class Solution {
    public String removeDuplicates(String str, int k) {
        Stack <Pair> stack = new Stack();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(stack.isEmpty())
            {
                Pair pair = new Pair(ch,1);
                stack.push(pair);
            }
            else
            {
                Pair top = stack.peek();
                if(top.key == ch)
                {
                    top.value++;
                    if(top.value==k)
                        stack.pop();
                }
                else
                {
                    Pair pair = new Pair(ch,1);
                    stack.push(pair);
                }
                
            }
        }
        StringBuilder sb = new StringBuilder();
        //System.out.println(stack);
        while(!stack.isEmpty())
        {
            Pair top = stack.pop();
            String result = String.valueOf(top.key).repeat(top.value);
            sb.append(result);
        }
        sb.reverse();
        return new String(sb);
        
    }
}

class Pair{
    Character key;
    Integer value;
    Pair(Character k, Integer v)
    {
        this.key = k;
        this.value = v;
    }
    
}