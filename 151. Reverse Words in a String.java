class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String [] a = s.split("\\s+");
        int n = a.length;
        int i,j;
        i=0;
        j=n-1;
        String temp;
        while(i<j)
        {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        StringBuffer ans = new StringBuffer();
        for(i=0;i<n;i++)
        {
            //System.out.println(i+" "+a[i]);
            
            
            if(a[i].contentEquals(""))
            {
                System.out.println(i+"inside "+a[i]);
                continue;
            }
            if(i==n-1)
            {
                ans.append(a[i]);
            }
            else
                ans.append(a[i]+" ");
        }
        String finalAns = new String (ans);
        finalAns.trim();
        
        return finalAns;
    }
}
