class Solution {
    public boolean isPalindrome(String s) {
       int n = s.length();
        s = s.toLowerCase();
        int i = 0;
        int j = n-1;
        
        while(i<j)
        {
            if(!Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;
                continue;
            }  
            if(s.charAt(i)!=s.charAt(j))
            {
                //System.out.println(s.charAt(i)+" "+s.charAt(j));
                return false;
                
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
        
        
        
    }
}
