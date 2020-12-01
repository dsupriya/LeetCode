class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        LinkedList <Integer> first = new LinkedList();
        LinkedList <Integer> second = new LinkedList();
        int n = words.length;
        for(int i=0;i<n;i++)
        {   String word = words[i];
            if(word.equals(word1))
                first.add(i);
            else if(word.equals(word2))
                second.add(i);
                
        }
        System.out.println(first);
        System.out.println(second);
        
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
