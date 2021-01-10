class Solution {
    public int[] asteroidCollision(int[] a) {
        int n = a.length;
        Stack <Integer> s = new Stack();
        int cur;
        for(int i=0;i<n;i++)
        {
            cur = a[i];
            if(s.isEmpty() || cur>0)
            {
                s.push(cur);
            }
            else
            {
                while(true)
                {
                    int top = s.peek();
                    if(top<0)
                    {
                        s.push(cur);
                        break;
                    }
                    else if(top>(-cur))
                    {
                        break;
                    }
                    else if(top==(-cur))
                    {
                        s.pop();
                        break;
                    }
                    else
                    {
                        s.pop();
                        if(s.isEmpty())
                        {
                            s.push(cur);
                            break;
                        }
                    }
                    
                }
            }
        }
        int []ans = new int[s.size()];
        int i=ans.length-1;
        while(s.isEmpty()==false)
        {
            ans[i] = s.pop();
            i--;
         }
        return ans;
        
    }
}
