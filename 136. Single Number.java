class Solution {
    public int singleNumber(int[] a) {
        //int n= a.length;
        int ans = 0;
        for(int i=0;i<a.length;i++)
            ans = ans^a[i];
        return ans;
        
        
    }
}
