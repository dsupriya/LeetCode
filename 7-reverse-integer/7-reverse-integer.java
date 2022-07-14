class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x<0)
            isNegative = true;
        x = Math.abs(x);
        int rev = 0;
        int prev = 0;
        while(x>0)
        {
            int rem = x%10;
            rev = (rev*10) + rem;
            if((rev-rem)/10 !=prev)
                return 0;
            x = x/10;
            prev = rev;
        }
        if(isNegative)
            rev = rev *-1;
        return rev;
        
        
            
    }
}