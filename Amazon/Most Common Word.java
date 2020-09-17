import java.util.*;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        String [] words = getWords(paragraph);
        HashSet <String> hs = getHashSet(banned);
        HashMap <String,Integer> hm = new HashMap<String,Integer>();
        int max = -1;
        String ans = "";
        for(int i=0;i<words.length;i++)
        {
            String cur = words[i];
            if(hs.contains(cur)) continue;
            if(hm.containsKey(cur))
            {
                hm.put(cur,hm.get(cur)+1);
                
            }
            else
                hm.put(cur,1);
            if(hm.get(cur)>max)
                {
                    max = hm.get(cur);
                    ans = cur;
                }
                
        }
        
        
        return ans;
    }
    public static HashSet<String> getHashSet(String[] banned)
    {
        HashSet <String> hs = new HashSet<String>();
        for(int i =0;i<banned.length;i++)
            hs.add(banned[i]);
        return hs;
        
    }
    public static String [] getWords(String paragraph)
    {
        paragraph = paragraph.toLowerCase();
        StringBuilder str = new StringBuilder(paragraph);
        //str = str.toLowerCase();
        String origin = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            
            if(c==' ')
                continue;
            else if(origin.contains(c+"")==false)
            {
                //System.out.println(c);
                str.replace(i,i+1," ");
                i--;
            }
        }
        paragraph = new String(str);
        String [] words = paragraph.split(" +");
        //System.out.println(words.length);
        return words;
        
        
        
    }
}
