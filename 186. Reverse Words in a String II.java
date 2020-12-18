class Solution {
    public void reverseWords(char[] s) {
        int n = s.length;
        reverse(s,0,n-1);
        int i = 0;
        int j = 0;
        for( j = 0;j<n&&i<n;)
        {
            if(s[j]==' ')
            {
                reverse(s,i,j-1);
                j++;
                i=j;
            }
            else
            {
                j++;
            }
        }
        reverse(s,i,j-1);
        
        
    }
    public void reverse(char [] a, int i, int j)
    {
        char temp;
        while(i<j)
        {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
                
        }
    }
}
