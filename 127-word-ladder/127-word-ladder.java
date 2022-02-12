class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        HashSet <String> hs = new HashSet();
        for(String word : wordList)
            hs.add(word);
        if(!hs.contains(endWord))
            return 0;
        LinkedList <Cell> queue = new LinkedList();
        Cell start = new Cell(beginWord,1);
        queue.add(start);
        while(!queue.isEmpty())
        {
            Cell cur = queue.removeFirst();
            String word = cur.word;
            if(word.equals(endWord))
                return cur.level;
            for(int i=0;i<word.length();i++)
            {
                for(int j=0;j<26;j++)
                {
                    char c = (char) (j + 'a');
                    if(c == word.charAt(i))
                        continue;
                    String trans = word.substring(0,i)+c+word.substring(i+1);
                    //System.out.println(trans);
                    if(hs.contains(trans))
                    {
                        //System.out.println(trans);
                        Cell new_cell = new Cell(trans, cur.level+1);
                        queue.add(new_cell);
                        hs.remove(trans);
                    }
                }
            }
        }
        return 0;
            
        
        
        
    }
}

class Cell
{
    String word;
    Integer level;
    Cell(String word, Integer level)
    {
        this.word = word;
        this.level = level;
    }
}