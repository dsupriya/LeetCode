import java.util.*;
class Solution {
    public int minMeetingRooms(int[][] intervals) {
        LinkedList <Pair> list = new LinkedList <Pair>();
        int n = intervals.length;
        for(int i=0;i<n;i++)
            list.add(new Pair(intervals[i][0],intervals[i][1]));
        Collections.sort(list, new SortByStartAec());
        PriorityQueue <Pair> heap = new PriorityQueue<Pair> (new SortByEndAec());
        int ans = 0;
        Iterator <Pair>itr = list.iterator();
        while(itr.hasNext())
        {
            Pair temp = itr.next();
            if(heap.size()==0 || heap.peek().end >temp.start)
                heap.add(temp);
            else
            {
                heap.poll();
                heap.add(temp);
            }
        }
        
        return heap.size();
       
    }
}
class Pair
{
    Integer start,end;
    Pair(int x ,int y)
    {
        this.start = x;
        this.end = y;
    }
}
class SortByEndAec implements Comparator <Pair>
{
    public int compare(Pair ob1, Pair ob2)
    {
        return ob1.end.compareTo(ob2.end);
    }
}
class SortByStartAec implements Comparator <Pair>
{
    public int compare(Pair ob1, Pair ob2)
    {
        return ob1.start.compareTo(ob2.start);
    }
}
