class Solution {
    public String smallestSubsequence(String s) {
        
        int []last = new int[26];
        boolean []seen = new boolean[26];
        Stack <Integer> stack= new Stack();
        
        for(int i=0;i<s.length();i++)
        {
            int c = s.charAt(i) - 'a';
            last[c] = i;
        }
        for(int i=0;i<s.length();i++)
        {
            int c = s.charAt(i) - 'a';
            if(seen[c])
                continue;
            while(!stack.isEmpty() && stack.peek()>c && i < last[stack.peek()])
            {
                seen[stack.pop()] = false;
            }
            stack.push(c);
            seen[c] = true;
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty())
        {
            char c = (char)(stack.pop()+'a');
            ans.append(c);
        }
        return new String(ans.reverse());
        
        
    }
}
/*idea is to create array of last seen index of each elemnet
if top of stack > cur and there is later occurence of top of the stack, then we can get rid of top of the stack
*/