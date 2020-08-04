class Solution {
    public boolean isPowerOfFour(int n) {
        //boolean ans = true;
        if(n<=0)
            return false;
        if(n==1)
            return true;
        while(n>0)
        {
            if(n%4!=0)
                return false;
            if(n==4)
                return true;
            n = n/4;
        }
        return true;
    }
}
