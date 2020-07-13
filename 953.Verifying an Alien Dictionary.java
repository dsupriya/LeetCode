class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        int n = words.length;
        boolean ans = true;
        for(int i=0;i<n-1;i++)
        {
            ans = checkLexo(words[i],words[i+1],order);
            if(ans==false)
                return ans;
        }
        return ans;
    }
    public static boolean checkLexo(String a, String b, String order)
    {
        int n =a.length();
        int m =b.length();
        int i,j;
        i=j=0;
        boolean ans =true;
        int p,q;
        p=q=0;
        while(i<n && j<m)
        {
            p=order.indexOf(a.charAt(i));
            q=order.indexOf(b.charAt(j));
            if(p<q)
                return true;
            else if(q<p)
                return false;
            i++;
            j++;
        }
        if(i==n)
            return true;
        else 
            return false;
    }
}
