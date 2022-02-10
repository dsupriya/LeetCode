class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode cur,delay;
        cur = head;
        while(count<n)
        {
            cur=cur.next;
            count++;
        }
        //System.out.println(cur.val);
        delay = head;
        ListNode prev;
        prev = head;
        while(cur.next!=null)
        {
            prev = delay;
            delay = delay.next;
            cur = cur.next;
        }
        if(delay==head)
            return head.next;
        prev.next = delay.next;
        return head;
        
        
    }
}