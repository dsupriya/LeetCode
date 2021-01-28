class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashMap <String,Boolean> visited = new HashMap <String,Boolean>();
        HashMap <String,LinkedList<String>> hm = new HashMap <String,LinkedList<String>>();
        LinkedList <Cell> q = new LinkedList<Cell>();
        int ans = 0;
        
        Iterator itr = wordList.iterator();
        int l = beginWord.length();
        
        while(itr.hasNext())
        {
            String origin = (String) itr.next();
            visited.put(origin,false);
            for(int i=0;i<l;i++)
            {
                String newWord = origin.substring(0,i)+'*'+origin.substring(i+1,l);
                LinkedList <String> trns = hm.getOrDefault(newWord,new LinkedList <String>());
                trns.add(origin);
                hm.put(newWord,trns);
            }
        }
        System.out.println(hm);
        q.add(new Cell(beginWord,1));
        
        while(!q.isEmpty())
        {
            Cell temp = q.poll();
            String word = temp.word;
            int level = temp.level;
            
            for(int i=0;i<l;i++)
            {
                String newWord = word.substring(0,i)+"*"+word.substring(i+1,l);
                if(hm.containsKey(newWord))
                {
                   LinkedList <String> combination = hm.get(newWord);
                   itr =  combination.iterator();
                    while(itr.hasNext())
                    {
                        String next = (String) itr.next();
                        if(next.equals(endWord))
                        {
                            return level+1;
                        }
                        if(visited.get(next)==false)
                        {
                            q.add(new Cell(next,level+1));
                            visited.put(next,true);
                        }
                    }
                }
            }
        }
        return ans;
        
    }
}

class Cell
{
    String word;
    int level;
    Cell(String word, int level)
    {
       this.word = word;
        this.level = level;
    }
}
