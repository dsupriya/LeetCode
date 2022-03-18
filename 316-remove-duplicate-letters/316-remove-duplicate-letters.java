class Solution {
    public String removeDuplicateLetters(String s) {
        int []last = new int[26];
        boolean []seen = new boolean[26];
        
        for(int i=0;i<s.length();i++)
        {
            int c = s.charAt(i)-'a';
            last[c] = i;
        }
        Stack <Integer> stack = new Stack();
        for(int i=0;i<s.length();i++)
        {
            int c = s.charAt(i)-'a';
            if(seen[c])
                continue;
            while(!stack.isEmpty() && stack.peek()>c && i < last[stack.peek()])
            {
                //System.out.println(c);
                seen[stack.pop()] =false;
            }
            stack.push(c);
            seen [c] = true;
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty())
        {
            char c = (char)(stack.pop() + 'a');
            ans.append(c);
            
        }
        return new String(ans .reverse());
        
        
    }
}