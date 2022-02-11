class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
        if(s1.length()>s2.length())
            return false;
        int [] hash1 = new int [26];
        int [] hash2 = new int [26];
        for(int i=0;i<s1.length();i++)
        {
            int index = s1.charAt(i) - 'a';
            hash1[index]++;
        }
        int len = s1.length();
        createHash(s2.substring(0,len),hash2);
        for(int i=0;i<=s2.length()-len;i++)
        {
            if(isAnagram(hash1,hash2))
            {
                return true;
            }
            else
            {
                int end = i+len;
                
              
                if( end >=s2.length())
                    return false;
                hash2[s2.charAt(i)-'a']--;
                hash2[s2.charAt(end)-'a']++;
            }
        }
        return false;
        
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
