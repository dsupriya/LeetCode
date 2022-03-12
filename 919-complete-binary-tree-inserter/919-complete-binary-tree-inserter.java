/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class CBTInserter {
    TreeNode root;
    LinkedList <TreeNode> parent;
    public CBTInserter(TreeNode root) {
        this.root = root;
        LinkedList <TreeNode> q = new LinkedList();
        this.parent = new LinkedList();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode cur = q.removeFirst();
            parent.add(cur);
            if(cur.left!=null)
                q.add(cur.left);
            if(cur.right!=null)
                q.add(cur.right);
        }
    }
    
    public int insert(int val) {
        TreeNode cur = this.parent.getFirst();
        TreeNode new_node = new TreeNode(val);
        
        if(cur.left==null)
        {
            cur.left = new_node;
            this.parent.add(new_node);
            return cur.val;   
        }
        else if(cur.right == null)
        {
            cur.right = new_node;
            this.parent.add(new_node);
            return cur.val;  
        }
        else
        {

            cur = this.parent.removeFirst();
            return this.insert(val);
            
            
        }
         
        
    }
    
    public TreeNode get_root() {
        return this.root;
        
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */