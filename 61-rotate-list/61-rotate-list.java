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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return head;
        int n = findLength(head);
        int rem = k%n;
        if(rem == 0)
            return head;
        int rank_from_start = n-rem;
        ListNode cur,prev;
        cur = head;
        prev = null;
        //System.out.println(rank_from_start);
        int i = 0;
        while(i<rank_from_start && cur!=null)
        {
           //System.out.print(" "+cur.val);
            prev = cur;
            cur = cur.next;
            i++;
        }
        prev.next = null;
        ListNode new_head = cur;
        //System.out.println(cur.val);
        while(cur.next!=null)
            cur=cur.next;
        cur.next = head;
        
        return new_head;
        
        
        
    }
    public int findLength(ListNode head)
    {
        int n = 0;
        while(head!=null)
        {
            n++;
            head = head.next;
        }
        return n;
    }
}
