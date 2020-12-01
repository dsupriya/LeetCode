class WordDistance {
    HashMap <String,LinkedList<Integer>> hm ;
    public WordDistance(String[] words) {
        hm = new HashMap();
        int n = words.length;
        for(int i=0;i<n;i++)
        {
            String word = words[i];
            LinkedList<Integer> list = hm.getOrDefault(word, new LinkedList<Integer>());
            list.add(i);
            hm.put(word,list);
        }
    }
    
    public int shortest(String word1, String word2) {
        LinkedList <Integer> first = hm.get(word1);
        LinkedList <Integer> second = hm.get(word2);
        
        
        int ans = Integer.MAX_VALUE;
        Iterator <Integer>   it1 = first.iterator();
        Iterator <Integer>   it2 = second.iterator();
        int i,j;
        while(it1.hasNext())
        {
            i= it1.next();
            it2 = second.iterator();
            while(it2.hasNext())
            {
                j = it2.next();
                ans = Math.min(Math.abs(j-i),ans);
            }
        }
        return ans;
        
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */
