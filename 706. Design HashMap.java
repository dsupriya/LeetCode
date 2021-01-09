class MyHashMap {

    /** Initialize your data structure here. */
    Integer [] HashMap;
    final Integer mod = 10000001;
    public MyHashMap() {
        HashMap = new Integer[1000001];
        
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int rem = key % mod;
        HashMap [rem] = value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
         int rem = key % mod;
         Integer value =  HashMap [rem] ;
         if(value==null)
            return -1;
         return value;
            
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int rem = key % mod;
        HashMap [rem] = null;
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
