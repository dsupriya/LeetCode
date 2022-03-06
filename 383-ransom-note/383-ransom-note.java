class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] m = new int[26];
        int note[] = new int[26];
        char c;
        
        for(int i=0;i<magazine.length();i++)
        {
            c = magazine.charAt(i);
            m[c-'a']++;
        }
        int index;
        for(int i=0;i<ransomNote.length();i++)
        {
            c = ransomNote.charAt(i);
            note[c-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(m[i]<note[i])
                return false;
        }
        return true;
    }
}