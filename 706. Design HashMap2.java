class MyHashMap {

    /** Initialize your data structure here. */
    Integer size = 2069;
    int mod = 2069;
    ArrayList <LinkedList<Pair>> hm;
    
    
    public MyHashMap() {
        hm = new ArrayList();
        for(int i=0;i<size;i++)
            hm.add(new LinkedList<Pair>());
        
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        boolean found = false;
        int rem = key%mod;
        LinkedList <Pair> bucket = hm.get(rem);
        for(Pair e : bucket)
        {
            if(e.x ==key)
            {
                found = true;
                e.y = value;
                break;
            }
        }
        if(!found)
        {
            Pair newEntry = new Pair(key,value);
            bucket.add(newEntry);
        }
        
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        boolean found = false;
        int rem = key%mod;
        LinkedList <Pair> bucket = hm.get(rem);
        for(Pair e : bucket)
        {
            if(e.x ==key)
            {
                found = true;
                return e.y;
            }
        }
        return -1;
        
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
       
        int rem = key%mod;
        LinkedList <Pair> bucket = hm.get(rem);
        for(Pair e : bucket)
        {
            if(e.x ==key)
            {
                bucket.remove(e);
                return;
            }
        }
        
    }
}

class Pair{
    Integer x,y;
    Pair(int a,int b)
    {
        this.x = a;
        this.y = b;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
