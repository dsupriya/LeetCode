class Solution {
    public int minMutation(String start_word, String end, String[] bank) {
        HashSet <String> hs = new HashSet();
        
        for(int i=0;i<bank.length;i++)
            hs.add(bank[i]);
        if(!hs.contains(end))
            return -1;
        char []gene = {'A','C','G','T'};
        
        Cell start = new Cell(start_word,0);
        LinkedList <Cell> q = new LinkedList();
        q.add(start);
        
        while(!q.isEmpty())
        {
            Cell cur = q.removeFirst();
            String word = cur.word;
            
            if(word.equals(end))
                return cur.level;
            
            for(int i=0;i<word.length();i++)
            {
                
                for(int j=0;j<4;j++)
                {
                    if(gene[j] == word.charAt(i))
                        continue;
                    String trans = word.substring(0,i)+gene[j]+word.substring(i+1);
                    if(hs.contains(trans))
                    {
                        Cell new_cell = new Cell(trans,cur.level+1);
                        q.add(new_cell);
                        hs.remove(trans);
                    }
                }
            }
        }
        return -1;
        
        
        
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