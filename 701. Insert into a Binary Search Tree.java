/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    Node parent,leftmost,prev;
    public Node connect(Node root) {
        if(root==null)
            return root;
        leftmost =parent =root;
        prev = null;
        while(leftmost!=null)
        {
            parent = leftmost;
            leftmost=null;
            while(parent!=null)
            {
                connected(parent.left);
                connected(parent.right);
                parent=parent.next;
            }
            
        }
        return root;
    }
    public void connected(Node cur)
    {
        if(cur!=null)
        {
            if(leftmost==null)
            {
                leftmost = cur;
            }
            else
            {
                prev.next = cur;
            }
            prev = cur;
        }
    }
}
