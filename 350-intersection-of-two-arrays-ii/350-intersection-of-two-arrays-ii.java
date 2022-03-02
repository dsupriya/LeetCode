class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList <Integer> ans = new ArrayList();
        int i,j;
        i=j=0;
        
        while(i < nums1.length && j<nums2.length)
        {
            if(nums1[i] == nums2[j])
            {
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j])
            {
                i++;
            }
            else
                j++;
        }
        int [] res = new int[ans.size()];
        i = 0;
        
        for(Integer num : ans)
        {
            res[i] = num;
            i++;
            
        }
        return res;
            
        
    }
}