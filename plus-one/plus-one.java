class Solution {
    public int[] plusOne(int[] digits) {
        
        LinkedList <Integer> list = new LinkedList();
        int sum,carry;
        sum=carry=0;
        carry = 1;
        int n = digits.length;
        
        for(int i=n-1;i>=0;i--)
        {
            sum = carry+digits[i];
            carry=sum/10;
            sum = sum%10;
            
            
            list.addFirst(sum);
        }
        
        if(carry==1)
            list.addFirst(carry);
        System.out.println(list);
        
        int [] ans = list.stream().mapToInt(i->i).toArray();
        return ans;
    }
}