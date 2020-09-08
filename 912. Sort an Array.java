class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
    public static void quickSort(int []a, int left, int right)
    {
        if(left<right)
        {
            int p = partion(a,left,right);
            quickSort(a,left,p-1);
            quickSort(a,p+1,right);
        }
    }
    public static int partion(int []a, int l, int r)
    {
        int i = l-1;
        int p = a[r];
        for(int j = l;j<=r;j++)
        {
            if(a[j] <= p)
            {
                i++;
                int t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        //i++;
        int t = a[i];
        a[i] = p;
        p = t;
        return i;
    }
}

