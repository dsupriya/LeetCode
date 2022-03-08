class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        if(head.val==val)
            head = removeElements(head.next,val);
        else
            head.next = removeElements(head.next,val);
        
        return head;
    }
}