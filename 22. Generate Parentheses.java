class Solution {
    public List<String> generateParenthesis(int n) {
        LinkedList <String> ans = new LinkedList();
        generateAll(new char[2*n],0,ans);
        return ans;
        
    }
    public void generateAll(char []ch, int pos,  LinkedList <String> ans)
    {
        
        if(pos==ch.length)
        {
            if(valid(ch))
            {
                String comb = new String(ch);
                ans.add(comb);
                return;
            }
            else
                return;
        }
        ch[pos] = '(';
        generateAll(ch,pos+1,ans);
        ch[pos] = ')';
        generateAll(ch,pos+1,ans);
    }
    public boolean valid (char []ch)
    {
        int n = ch.length;
        int balance = 0;
        for(int i=0;i<n;i++)
        {
            if(ch[i]=='(')
                balance++;
            else 
                 balance--;
            if( balance<0)
                return false;
                
        }
        return  balance ==0;
    }
    
}
