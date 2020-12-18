class MovingAverage {

    /** Initialize your data structure here. */
    LinkedList <Integer> queue;
    Integer n;
    double sum;
    public MovingAverage(int size) {
        queue = new LinkedList();
        n = size;
        sum = 0.0;
    }
    
    public double next(int val) {
        double ans;
        if(queue.size()<n)
        {
            queue.add(val);
            sum = sum+val;
            ans = sum/queue.size();
        }
        else
        {
            int temp = queue.pollFirst();
            sum = sum-temp+val;
            queue.add(val);
            ans = sum/queue.size();
        }
        return ans;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
