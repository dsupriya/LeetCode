class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int m = nums2.length;
        int []ans = new int[n];
        int temp =-1;
        HashMap <Integer,Integer> hm = new HashMap <Integer,Integer>();
        Stack <Integer> s = new Stack<Integer>();
        
        for(int i=0;i<m;i++)
        {
            if(s.isEmpty() || s.peek()> nums2[i])
                s.push(nums2[i]);
            else
            {
                while(!s.isEmpty() && s.peek() < nums2[i])
                {
                    hm.put(s.pop(),nums2[i]);
                }
                i--;
            }
        }
         while(!s.isEmpty())
        {
            hm.put(s.pop(),-1);
        }
        for(int i=0;i<n;i++)
        {
            ans[i] = hm.get(nums1[i]);
        }
        //System.out.println(hm);
        return ans;
        
        
        
    }
}
