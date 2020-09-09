class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        LinkedList <Integer> ans = new LinkedList<Integer>();
        int k,l,m,n;
        k=l=0;
        m=a.length-1;
        if(m<0)
            return ans;
        
        n =a[0].length-1;
        while(k<=m && l<=n)
        {
            //right
            for(int i=l;i<=n;i++)
                ans.add(a[k][i]);
            k++;
            for(int i=k;i<=m;i++)
                ans.add(a[i][n]);
            n--;
            if(l<=n && k<=m)
            {
                for(int i=n;i>=l;i--)
                ans.add(a[m][i]);
                 m--;
                for(int i=m;i>=k;i--)
                ans.add(a[i][l]);
                l++;
            }
        }
     return ans;   
    }
}
