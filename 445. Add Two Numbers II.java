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
    public static int carry = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
       
        int n1 = length(l1);
        int n2 = length(l2);
        ListNode big,small;
        if(n1>n2)
        {
            big = l1;
            small = l2;
        }
        else
        {
            big = l2;
            small = l1;
        }
        int rem = Math.abs(n1-n2);
        System.out.println(rem);
        if(rem>0)small = addLeadingZero(small,rem);
        carry = 0;
        ListNode head = add(small,big);
        if(carry>0)
        {
            ListNode temp = new ListNode(carry);
            temp.next = head;
            return temp;
        }
        return head;
        
    }
    public  int length(ListNode head)
    {
        int ans = 0;
        while(head!=null)
        {
            ans++;
            head= head.next;
        }
        return ans;
    }
    public ListNode addLeadingZero(ListNode head, int n)
    {
        ListNode temp = head;
        while(n>0)
        {
            n--;
            temp = new ListNode(0);
            temp.next = head;
            head= temp;
        }
        return temp;
    }
    public ListNode add(ListNode l1, ListNode l2)
    {
        if(l1==null&&l2==null)
            return null;
        ListNode next_node = add(l1.next,l2.next);
        int value = l1.val+l2.val+carry;
        carry = value/10;
        value = value%10;
        
        ListNode temp = new ListNode(value);
        temp.next = next_node;
        return temp;
        
    }
    
}
