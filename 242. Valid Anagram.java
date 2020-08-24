import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        
        char []word1 = s.toCharArray();
        char []word2 = t.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        if(Arrays.equals(word2,word1))
            return true;
        else return false;
        
        
    }
}
