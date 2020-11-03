class Solution {
    public int[] replaceElements(int[] arr) {
        
        int max = -1;
        int n = arr.length;
        int temp = arr[n-1];
        
        for(int i =n-2;i>=0;i--)
        {
            
            max = Math.max(temp,max);
            temp = arr[i];
            arr[i] = max;
            
        }
        arr[n-1] = -1;
        return arr;
    }
}
