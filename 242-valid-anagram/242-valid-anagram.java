class Solution {
    public boolean isAnagram(String s, String t) {
        int [] m = new int[26];
        int note[] = new int[26];
        char c;
        
        for(int i=0;i<s.length();i++)
        {
            c = s.charAt(i);
            m[c-'a']++;
        }
        int index;
        for(int i=0;i<t.length();i++)
        {
            c = t.charAt(i);
            note[c-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(m[i]!=note[i])
                return false;
        }
        return true;
        
    }
}