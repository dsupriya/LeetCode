class Solution {
    public int[] sumZero(int n) {
        int [] a = new int[n];
        if(n==0)
            return a;
        int i =0;
        if(n%2==1)
        {
            a[i] = 0;
            i++;
        }
        int count = 1;
        while(i<n-1)
        {
            a[i] = count;
            i++;
            a[i] = (-1)*count;
            i++;
            count++;
        }
        return a;
    }
}
