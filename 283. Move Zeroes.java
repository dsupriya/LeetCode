class Solution {
    public void moveZeroes(int[] a) {
        int n =a.length;
        //int temp=0;
        for(int i=0,j=0;i<n&&j<n;i++)
        {
            if(a[i]!=0)
            {
                int temp = a[j];
                a[j]=a[i];
                a[i]=temp;
                j++;
            }
        
    }
}
}
