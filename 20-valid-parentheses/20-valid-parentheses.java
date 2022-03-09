class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack ();
        HashMap <Character,Character> hm = new HashMap();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
                stack.push(ch);
            else
            {
                if(stack.isEmpty())
                    return false;
                char poped = stack.pop();
                if(poped!=hm.get(ch))
                    return false;
            }
        }
        return stack.isEmpty() == true ? true : false;
        
    }
}