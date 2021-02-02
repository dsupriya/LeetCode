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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return head;
        if(head.next==null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode even_head = even;
        ListNode pre = head;
        
        while(odd!=null && even!=null)
        {
            odd.next = even.next;
            pre = odd;
            odd = odd.next;
            if(odd!=null)
                even.next = odd.next;
           
            even = even.next;
            
        }
        if(odd!=null)
            odd.next = even_head;
        else
            pre.next = even_head;
        return head;
        
    }
}
