class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack <Integer>s = new Stack <Integer>();
        boolean ans = false;
        int n = pushed.length;
        for(int i=0,j=0;i<n||j<n;)
        {
            if(s.isEmpty() || popped[j]!=s.peek())
            {
                if(i>=n)
                    return false;
                s.push(pushed[i]);
                i++;
            }
            else
            {
                s.pop();
                j++;
            }
                
        }
        return s.isEmpty();
    }
}
