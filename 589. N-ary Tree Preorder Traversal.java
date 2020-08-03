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
    public List<Integer> preorder(Node root) {
        LinkedList <Integer> ans = new LinkedList <Integer>();
       order(ans,root);
        return ans;
        
    }
    public static void order(LinkedList <Integer> ans, Node root)
    {
        if(root==null)
            return;
        ans.add(root.val);
        Iterator itr = root.children.iterator();
        while(itr.hasNext())
            order(ans,(Node)itr.next());
    }
}
