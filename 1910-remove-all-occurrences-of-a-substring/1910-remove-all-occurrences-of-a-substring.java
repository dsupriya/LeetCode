class Solution {
    public String removeOccurrences(String s, String part) {
        
        if(s.contains(part))
        {
            String str = s.replaceFirst(part,"");
            s = removeOccurrences(str,part);
        }
        return s;
        
    }
}