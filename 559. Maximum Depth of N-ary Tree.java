/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root == null)
            return 0;
        //LinkedList <Integer> ans = new LinkedList <Integer>();
        Iterator itr = root.children.iterator();
        int max = 0;
        Node temp = null;
        int t =0;
        while(itr.hasNext())
        {
             temp = (Node)itr.next();
             t =  maxDepth(temp);
            if(max<t)
                max =t;
        }
        return 1+ max;
    }
}
