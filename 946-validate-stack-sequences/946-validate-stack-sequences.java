class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack <Integer> s = new Stack();
        
        int n = pushed.length;
        int j = 0;
        
        for(int i=0;i<n;i++)
        {
        
            s.push(pushed[i]);
            while(j<n && !s.isEmpty() && popped[j] == s.peek())
            {
                s.pop();
                j++;
            }
        }
        while( j<n && !s.isEmpty() && popped[j] == s.peek())
        {
                s.pop();
                j++;
        }
            
        return s.isEmpty();
        
    }
}