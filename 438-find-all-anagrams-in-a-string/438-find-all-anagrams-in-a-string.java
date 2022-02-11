class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        LinkedList <Integer> ans = new LinkedList();
        if(p.length()>s.length())
            return ans;
        int []hash1 = new int [26];
        int []hash2 = new int [26];
        int len = p.length();
        createHash(p,hash1);
        createHash(s.substring(0,len),hash2);
        
        for(int i=0;i<=s.length()-len;i++)
        {
            if(isAnagram(hash1,hash2))
            {
                ans.add(i);
            }
            int end = i+len;
            if(end>=s.length())
                break;
            else
            {
                hash2[s.charAt(i)-'a']--;
                hash2[s.charAt(end)-'a']++;
            }
            
        }
        
        return ans;
        
        
    }
    public boolean isAnagram(int [] s1, int []s2)
    {
        
        for(int i=0;i<26;i++)
        {
            if(s1[i]!=s2[i])
                return false;
            
        }
        return true;
    }
     public void createHash(String s1, int []hash)
    {
        
        for(int i=0;i<s1.length();i++)
        {
            int index = s1.charAt(i) - 'a';
           
            hash[index]++;
        }
    }
}