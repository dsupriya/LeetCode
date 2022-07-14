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

/*
3 things , reverse the num, take care of neagtive and overflow
1) rev = (rev*10)+rem;
2) negative can be handled with simple boolean
3) for overflow, keep prev reversed number
at each step , check if((rev-rem))/10  == prev if not, number has oveflown

*/