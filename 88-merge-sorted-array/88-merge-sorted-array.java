class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int []ans = new int [nums1.length];
        
        int first = 0;
        int second = 0;
        if(n==0)
            return;
        if(m==0)
            copyAnstoNums1(nums1,nums2);
        int i = 0;
        
        while(first < m || second < n)
        {
            int v1 = (first >= m) ? Integer.MAX_VALUE : nums1[first];
            int v2 = (second >= n) ? Integer.MAX_VALUE : nums2[second];
            
            if(v1 < v2 )
            {
                ans[i] = v1;
                first++;
            }
            else
            {
                ans[i] = v2;
                second++;
            }
            i++;
                
        }
        copyAnstoNums1(nums1,ans);
        
    }
    public void copyAnstoNums1(int []nums1 , int ans[])
    {
        for(int i=0; i< nums1.length;i++)
            nums1[i] = ans[i];
    }
}