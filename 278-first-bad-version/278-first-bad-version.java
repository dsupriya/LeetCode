/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start,end,mid,prev;
        start = 1;
        end = n;
        mid = (start+end)/2;;
        
        
        while(start<end)
        {
            mid = (start)+(end-start)/2;
            // int mid = left + (right - left) / 2;
            if(isBadVersion(mid))
            {
                end = mid ;
            }
            else
            {
                start = mid+1;
            }
        }
        return start;
            
        
        
    }
}
// 5 , 
/*
// 1 2 3 4 5 

4+5s

*/