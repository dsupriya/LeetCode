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
    public int getDecimalValue(ListNode head) {
        if(head==null)
            return 0;
        int n = len(head);
        n--;
        int ans = 0;
        ListNode cur = head;
        while(cur!=null)
        {
            ans = (int)Math.pow(2,n)*cur.val + ans;
            n--;
            cur = cur.next;
        }
        return ans;
    }
    public static int len(ListNode head)
    {
        int ans =0;
        while(head!=null)
        {
            ans++;
            head=head.next;
        }
        return ans;
    }
}
