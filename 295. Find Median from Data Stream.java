class MedianFinder {

    /** initialize your data structure here. */
    PriorityQueue <Integer>left;
    PriorityQueue <Integer>right;
    
    public MedianFinder() {
        left = new PriorityQueue<Integer>(Collections.reverseOrder());
        right = new PriorityQueue<Integer>();
        
    }
    
    public void addNum(int num) {
        if(left.size()==0 || num<left.peek())
        {
            left.add(num);
        }
        else
        {
            right.add(num);
        }
        rebalance();
        
    }
    public void rebalance()
    {
        PriorityQueue <Integer> small = left.size()<right.size()?left:right;
        PriorityQueue <Integer> large = left.size()>right.size()?left:right;
        if(large.size()-small.size()>=2)
            small.add(large.poll());
    }
    public double findMedian() {
        if(left.size()==right.size())
        {
            double ans = ((double)left.peek()+right.peek())/2;
            return ans;
        }
        PriorityQueue <Integer> small = left.size()<right.size()?left:right;
        PriorityQueue <Integer> large = left.size()>right.size()?left:right;
        return (double)large.peek();
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
