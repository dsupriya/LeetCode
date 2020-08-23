class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String []code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet <String>hs = new HashSet<String>();
    for(int i =0;i<words.length;i++)
    {
        String word = words[i];
        StringBuilder ans = new StringBuilder();
        for(int j=0;j<word.length();j++)
        {
            
            int t = word.charAt(j)-'a';
            ans = ans.append(code[t]);
        }
        hs.add(new String(ans));
    }
    return hs.size();
        
    }
}
