class Solution {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        if(word1.equals(word2))
            return same(words,word1,word2);
        int n = words.length;
        int a,b;
        int min = n;
        a=b=-1;
        for(int i=0;i<n;i++)
        {
           if(word1.equals(words[i]))
               a = i;
            if(word2.equals(words[i]))
                b = i;
            if(a!=-1 && b!=-1 && Math.abs(a-b)!=0)
                min = Math.min(Math.abs(a-b),min);
        }
        return min;
        
    }
    public int same(String[] words, String word1, String word2)
    {
        int n = words.length;
        int a,b;
        a=b=-1;
        int min = n;
        for(int i=0;i<n;i++)
        {
            if(word1.equals(words[i]))
            {
                if(a==-1)
                {
                    a=i;
                    
                }
                else if(b==-1)
                {
                    b=i;
                }
                else
                {
                    a=b;
                    b=i;
                }
            }
            if(a!=-1 && b!=-1 && Math.abs(a-b)!=0)
                min = Math.min(Math.abs(a-b),min);
        }
        return min;
    }
}
