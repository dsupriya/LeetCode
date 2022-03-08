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
    public ListNode deleteDuplicates(ListNode head) { 
        
        ListNode next = head;
        ListNode cur = head;
        if(head == null || head.next == null)
            return head;
        next = cur.next;
        while(cur!=null && cur.next!=null)
        {
            next = cur.next;
            if(cur.val == next.val)
            {
                cur.next = next.next;
            }
            else
            {
               cur = cur.next; 
            }
        }
        return head;
    }
}