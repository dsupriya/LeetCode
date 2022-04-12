import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
       
        PriorityQueue <Integer>heap = new PriorityQueue(Collections.reverseOrder());
        int n = stones.length;
        for(int i=0;i<n;i++)
            heap.add(stones[i]);
            
         while(heap.size()>1)
         {
             int x = heap.poll();
             int y = heap.poll();
             if(x==y)
                 continue;
             else
             {
                 int rem = x - y;
                 heap.add(rem);
             }
         }
        
        return heap.size()==0 ? 0 : heap.peek();
    }
}