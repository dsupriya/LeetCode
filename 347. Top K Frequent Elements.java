class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> hm = new  HashMap <Integer,Integer>();
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            count = hm.getOrDefault(nums[i],0);
            hm.put(nums[i],count+1);
        }
        int []ans = new int[k];
        PriorityQueue <Pair>heap = new PriorityQueue<Pair>(new SortByValueAce());
        for(Map.Entry e : hm.entrySet())
        {
            heap.add(new Pair((Integer)e.getKey(),(Integer)e.getValue()));
            if(heap.size()>k)
                heap.poll();
        }
        for(int i=0;i<k;i++)
        {
            Pair temp = heap.poll();
            ans[i] = temp.key;
        }
        
        
     
        return ans;
    }
}
class Pair
{
    Integer key,value;
    Pair(int key,int value)
    {
        this.key = key;
        this.value = value; 
    }
}
class SortByValueAce implements Comparator<Pair>
{
    public int compare(Pair ob1,Pair ob2)
    {
        return ob1.value.compareTo(ob2.value);
    }
}
