class Logger {

    /** Initialize your data structure here. */
    HashMap <String, Integer> hm ;
    public Logger() {
        hm = new HashMap();
        
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        
        if(!hm.containsKey(message))
        {
            hm.put(message,timestamp);
            return true;
        }
        else
        {
            int next = hm.get(message)+10;
            if(timestamp>=next)
            {
                hm.put(message,timestamp);
                return true;
            }
            else
                return false;
        }
            
        
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
