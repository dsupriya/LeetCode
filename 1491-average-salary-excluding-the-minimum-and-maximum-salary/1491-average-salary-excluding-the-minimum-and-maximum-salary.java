class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n = salary.length;
        int num = n-2;
        double sum = 0;
        
        for(int i=1;i<n-1;i++)
        {
            sum = sum + salary[i];
        }
        
        return (sum/num);
        
    }
}