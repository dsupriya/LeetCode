class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue <Integer> max_heap = new PriorityQueue(new HeapComparator());
        ArrayList <Integer> ans = new ArrayList();
        for(int i=0;i<k-1;i++)
            max_heap.add(nums[i]);
        for(int i=k-1;i<nums.length;i++)
        {
            max_heap.add(nums[i]);
            ans.add(max_heap.peek());
            max_heap.remove(nums[i-(k-1)]);
        }
        int []answer = new int[ans.size()];
        int i = 0;
        for(Integer a : ans )
        {
            answer[i] =a;
            i++;
        }
        return answer;
    }
}

class HeapComparator implements Comparator<Integer>
{
     public int compare(Integer o1, Integer o2)
    {
        return o2.compareTo(o1);
    }
}
