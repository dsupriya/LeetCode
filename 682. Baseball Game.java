class Solution {
    public int calPoints(String[] ops) {
        
        int n = ops.length;
        Stack <Integer> s = new Stack<Integer>();
        String op = "";
        
        for(int i=0;i<n;i++)
        {
            op = ops[i];
            if(op.equals("+"))
            {
                int val1 = s.pop();
                int val2 = s.pop();
                int val3 = val1+val2;
               
                s.push(val2);
                s.push(val1);
                s.push(val3);
            }
            else if(op.equals("D"))
            {
                s.push(s.peek()*2);
            }
            else if(op.equals("C"))
            {
                s.pop();
            }
            else
            {
                s.push(Integer.parseInt(op));
            }
        }
        int ans = 0;
        while(!s.isEmpty())
        {
            ans = ans+s.pop();
        }
        return ans;
    }
}
