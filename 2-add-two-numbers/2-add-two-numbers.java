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
        int num1,num2,carry,sum;
        ListNode dummy = new ListNode(0);
        carry = 0;
        ListNode prev = dummy;
        
        while(l1!=null || l2!=null)
        {
            num1 = l1==null ? 0:l1.val;
            l1 = l1==null ? l1:l1.next;
            
            num2 = l2==null ? 0:l2.val;
            l2 = l2==null ? l2:l2.next;
            
            sum = num1+num2+carry;
            carry = sum / 10;
            sum = sum % 10;
             
            ListNode newListNode = new ListNode(sum);
            prev.next = newListNode;
            prev = newListNode;
            
        }
        if(carry==1)
        {
            ListNode newListNode = new ListNode(1);
            prev.next = newListNode;
            prev = newListNode;
        }
        return dummy.next;
            
        
    }
}