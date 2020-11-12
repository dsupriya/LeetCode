class Solution {
    public String alienOrder(String[] words) {
        HashMap <Character, Integer> indegree = new  HashMap <Character, Integer>();
        HashMap <Character,LinkedList<Character>> graph = new HashMap();
        for(String word : words)
        {
            for(char c : word.toCharArray())
            {
                indegree.put(c,0);
                graph.put(c,new LinkedList<Character>());
            }
        }
        //find out relations
        for(int i=0;i<words.length-1;i++)
        {
            String word1 = words[i];
            String word2 = words[i+1];
            if(word1.length() > word2.length() && word1.startsWith(word2))
                return "";
            for(int j=0;j<Math.min(word1.length(),word2.length());j++)
            {
                if(word1.charAt(j)!=word2.charAt(j))
                {
                    char u = word1.charAt(j);
                    char v = word2.charAt(j);
                    LinkedList <Character> list = graph.get(u);
                    list.add(v);
                    graph.put(u,list);
                    indegree.put(v,1+indegree.get(v));
                    break;
                }
            }
        }
        StringBuffer ans = new StringBuffer();
        LinkedList <Character> q = new LinkedList();
        for(Map.Entry <Character,Integer>e : indegree.entrySet())
        {
            char c = e.getKey();
            int v = e.getValue();
            if(v==0)
                q.add(c);
        }
        while(!q.isEmpty())
        {
            char cur = q.poll();
            ans.append(cur);
            LinkedList <Character> neigh = graph.get(cur);
            for(char n : neigh)
            {
                indegree.put(n,indegree.get(n)-1);
                if(indegree.get(n)==0)
                    q.add(n);
            }
        }
        if(ans.length()<indegree.size())
            return "";
        return new String(ans);
    }
}
