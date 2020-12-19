class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s,e;
        s=0;
        e=n-1;
        int mid = 0;
        while(s<=e)
        {
            mid = s+(e-s)/2;
            if(arr[mid]<arr[mid+1])
                s = mid+1;
            else
                e = mid-1;
        }
        return s;
        
    }
}
