class Solution {
    public boolean isAnagram(String s, String t) {
        
      
        int n = s.length();
        int m = t.length();
        
        if(n!=m)
            return false;
        int[] visited_s = getCount(s);
        int[] visited_t = getCount(t);
        
        for(int i=0;i<26;i++)
        {
            if(visited_s[i]!=visited_t[i])
                return false;
        }
        return true;
        
        
        
        
    }
    
    public int[] getCount(String s)
    {
        int n = s.length();
        int []visited = new int[26];
        for(int i=0;i<n;i++)
        {
            int index = s.charAt(i) -'a';
            visited[index]++;
        }
        return visited;
    }
}