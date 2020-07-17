class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> hs = new HashSet<Integer>();
        int i,j;
        int n = nums1.length;
        int m = nums2.length;
        i=j=0;
        while(i<n )
        {
            hs.add(nums1[i]);
            i++;
        }
        HashSet <Integer> ans = new HashSet<Integer>();
        while(j<m)
        {
            if(hs.contains(nums2[j]))
                ans.add(nums2[j]);
            j++;
        }
        int [] a = new int[ans.size()];
        Iterator itr = ans.iterator();
        i=0;
        while(itr.hasNext())
        {
            a[i] = (int)itr.next();
            i++;
        }
        return a;
        
    }
}
