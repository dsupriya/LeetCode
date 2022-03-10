/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int first,second;
        int sum,carry;
        ListNode prev;
        carry =0;
        ListNode dummy = new ListNode(0);
        prev = dummy;
        
        
        
        while(l1!=null || l2!=null)
        {
            first = l1==null ? 0 : l1.val;
            second = l2==null ? 0 : l2.val;
            
            sum = first+second+carry;
            if(sum>=10)
            {
                sum = sum%10;
                carry = 1;
            }
            else
            {
                carry=0;
            }
            ListNode new_node = new ListNode(sum);
            prev.next = new_node;
            prev=new_node;
            
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            
        }
        if(carry==1)
        {
            ListNode new_node = new ListNode(1);
            prev.next = new_node;
            prev=new_node;
        }
        return dummy.next;
        
        
    }
}