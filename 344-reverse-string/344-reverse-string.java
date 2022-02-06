class Solution {
    public void reverseString(char[] s) {
        
        int n = s.length;
        if(n==0 | n==1)
            return;
        int start,end;
        start = 0;
        end = n-1;
        char temp;
        for(int i=0;i<=end;i++)
        {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return;
        
    }
}