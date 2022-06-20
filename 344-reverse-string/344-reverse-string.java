class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int j = n-1;
        char temp;
        
        for(int i=0;i<(n/2) && j>=0;i++,j--)
        {
            
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        return;
     
        
        
    }
}