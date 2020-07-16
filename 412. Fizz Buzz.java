class Solution {
    public List<String> fizzBuzz(int n) {
        LinkedList <String> ans = new LinkedList <String>();
        String t = "";
        boolean div3 = false;
        boolean div5 = false;
        for(int i=1;i<=n;i++)
        {
            t="";
            div3 = (i%3==0);
            div5 = (i%5==0);
            if(div3)
                t = t+"Fizz";
            if(div5)
               
                t = t+"Buzz";
            if(t=="") 
                t = ""+i;
            ans.add(t);
            
            
        }
        return ans;
    }
}
