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
        
        Node cur = head;
        Node ne;
        while(cur!=null)
        {
            
            
            Node temp = new Node(cur.val);
            temp.next = cur.next;
            cur.next = temp;
            cur = temp.next;
        }
        cur = head;
        while(cur!=null)
        {
            if(cur.random!=null)
                cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        
        Node origin,copy;
        origin = head;
        copy = head.next;
        head = copy;
        
        while(origin!=null && copy!=null && origin.next!=null && copy.next!=null)
        {
            
            origin.next = origin.next.next;
            copy.next = copy.next.next;
            origin = origin.next;
            copy = copy.next;
        }
        
        if(origin!=null)
            origin.next = null;
        if(copy!=null)
            copy.next = null;
        
        cur = head;
        /*while(cur!=null)
        {
            System.out.println(cur.val);
            cur = cur.next;
        }*/
        return head;
        
    }
}