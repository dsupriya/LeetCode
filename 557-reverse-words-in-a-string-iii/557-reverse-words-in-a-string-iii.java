class Solution {
    public String reverseWords(String s) {
        char [] ch = s.toCharArray();
        int i,j,n;
        n = ch.length;
        i = 0;
        j = 0;
        
        while(i < n && j<n)
        {
            if(ch[j] == ' ')
            {
                reverse(i,j-1,ch);
                i = j+1;
                j = j+1;
            }
            else
            {
                j++;
            }
        }
        reverse(i,j-1,ch);
        return new String(ch);
        
        
        
        
    }
    public void reverse( int i, int j , char []a)
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