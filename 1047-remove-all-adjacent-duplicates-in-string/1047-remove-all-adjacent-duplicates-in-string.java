class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> stack = new Stack();
        char []str = s.toCharArray();
        
        for(int i=0;i<str.length;i++)
        {
            char ch = str[i];
            if(stack.isEmpty() || stack.peek()!=ch)
            {
                stack.push(ch);
            }
            else
            {
                stack.pop();
            }
            
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
            
        }
        sb.reverse();
        return new String(sb);
        
    }
}