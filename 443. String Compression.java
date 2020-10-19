class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        StringBuilder s = new StringBuilder();
        
        int count = 0;
        int j = 0;
        int k = 0;
        
        for(int i=0;i<n;)
        {
            count = 1;
            j = i+1;
            while(j<n && i<n && chars[i]==chars[j])
            {
                
                j++;
                count++;
            }
            if(count==1)
            {
                chars[k]=chars[i];
                k++;
            }
               
            else
            {
                chars[k]=chars[i];
                k++;
                String temp = ""+count;
                for(int a=0;a<temp.length();a++)
                {
                    chars[k]= temp.charAt(a);
                    k++;
                }
            }
               
            i = j;
            
                
            
            
        }
       
        
        return k;
        
    }
}
