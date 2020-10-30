class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        
        PriorityQueue <Pair> heap = new PriorityQueue <Pair>(new SortByStart());
        for(int i=0;i<n;i++)
            heap.add(new Pair(intervals[i][0],intervals[i][1]));
        LinkedList <Pair> list = new LinkedList<Pair>();
        for(int i=0;i<n && heap.size()>=2;i++)
        {
            Pair first = heap.poll();
            Pair sec = heap.peek();
            if(sec.start<=first.end)
            {
                int end = Math.max(first.end,sec.end);
                Pair temp = new Pair(first.start,end);
                heap.poll();
                heap.add(temp);
                
            }
            else
            {
                list.add(first);
                System.out.println(list);
            }
                
        }
        while(heap.size()!=0)
        {
            list.add(heap.poll());
        }
        int ans[][] = new int[list.size()][2];
        Iterator itr = list.iterator();
        int i=0;
        while(itr.hasNext())
        {
            Pair temp =(Pair)itr.next();
            ans[i][0] = temp.start;
            ans[i][1] = temp.end;
            i++;
        }
        
            
        
        
        return ans;
        
        
        
    }
}
class Pair
{
    Integer start,end;
    Pair(int a, int b)
    {
        this.start = a;
        this.end = b;
    }
}
class SortByStart implements Comparator<Pair>
{
    public int compare(Pair ob1, Pair ob2)
    {
        return ob1.start.compareTo(ob2.start);
    }
}
