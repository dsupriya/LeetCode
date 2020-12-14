class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int [] small,big;
        if(n>m)
        {
            big = nums1;
            small = nums2;
        }
        else
        {
            big = nums2;
            small = nums1;   
        }
        LinkedList <Integer> ans = new LinkedList();
        HashMap <Integer,Integer> hm = new HashMap();
        int count = 0;
        for(int i : small)
        {
            count = hm.getOrDefault(i,0);
            hm.put(i,count+1);
        }
        for(int i :big)
        {
            count = hm.getOrDefault(i,0);
            if(count>0)
            {
                ans.add(i);
                hm.put(i,count-1);
            }
        }
        int []a = new int[ans.size()];
        Iterator <Integer>itr = ans.iterator();
        int i = 0;
        while(itr.hasNext())
        {
            a[i] = itr.next();
            i++;
        }
        return a;
        
        
    }
}
