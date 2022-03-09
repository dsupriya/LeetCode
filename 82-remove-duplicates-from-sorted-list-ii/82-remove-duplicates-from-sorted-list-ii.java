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
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode cur = head,pre = dummy;
    boolean flag = true;
    while(cur!=null && cur.next!=null){
        if(cur.next.val == cur.val){
            pre.next = cur.next.next;
            cur = cur.next;
            flag = false;
        }else{
            if(flag) pre = pre.next;
            cur = cur.next;
            flag = true;
        }
    }
    return dummy.next;
}
    public ListNode find(ListNode head)
    {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode cur = head;
        ListNode next = cur.next;
        boolean match = false;
        while(cur!=null && next!=null)
        {
            if(cur.val == next.val)
            {
                next = next.next;
                match = true;
            }
            else
            {
               
                return match == true ? next : cur;
              
            }
        }
        return next;
        
    }
}