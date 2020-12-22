class Solution {
    public String interpret(String command) {
        StringBuffer ans = new StringBuffer();
        int n = command.length();
        for(int i=0;i<n;)
        {
            //System.out.println(command.charAt(i));
            if(command.charAt(i)=='G')
            {
                ans.append("G");
                i++;
            }
            else if(i+1 <n && command.charAt(i+1)==')')
            {
                ans.append("o");
                i = i+2;
            }
            else
            {
                ans.append("al");
                i= i+4;
            }
            
        }
        return new String(ans);
        
    }
}
