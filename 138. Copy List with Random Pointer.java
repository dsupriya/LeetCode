/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        
        Node cur =head;
        Node temp = null;
        while(cur!=null)
        {
            temp = new Node(cur.val);
            temp.next = cur.next;
            cur.next = temp;
            cur = cur.next.next;
        }
        
        cur = head;
        while(cur!=null)
        {
            if(cur.random!=null)
            {
                cur.next.random = cur.random.next;
            }
            cur=cur.next.next;
        }
        
        Node copy =head.next;
        Node new_head = copy;
        cur = head;
        while(cur!=null && copy!=null && cur.next!=null && copy.next!=null)
        {
            cur.next =  cur.next.next;
            copy.next = copy.next.next;
            cur =  cur.next;
            copy = copy.next;
        }
        if(cur!=null)
            cur.next = null;
        if(copy!=null)
            copy.next =null;
        //print(head);
        //print(new_head);
        return new_head;
    }
    
    public static void print(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println("next");
    }
    
    
}
