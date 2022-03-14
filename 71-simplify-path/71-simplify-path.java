class Solution {
    public String simplifyPath(String path) {
        
        Stack <String> s = new Stack();
        
        String []paths = path.split("//|/");
        for(int i=0;i<paths.length;i++)
        {
            //System.out.println("this "+paths[i]);
           if(paths[i].equals(".."))
           {
               if(!s.isEmpty())
                   s.pop();
           }
           else if(paths[i].equals(".") || paths[i].equals(""))
           {
               continue;
           }
            else
                s.push(paths[i]);
        }
        StringBuilder sb = new StringBuilder();
         
        while(!s.isEmpty())
        {
            String word = "/" + s.pop();
            sb.insert(0,word);
        }
        if(sb.isEmpty())
            sb = sb.append("/");
        return new String(sb);
    }
}