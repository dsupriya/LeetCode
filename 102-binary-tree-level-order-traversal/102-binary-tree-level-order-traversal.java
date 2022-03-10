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
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        LinkedList <TreeNode> q = new LinkedList();
        List<List<Integer>>  res = new LinkedList();
        LinkedList <Integer> level = new LinkedList();
        if(root==null)
            return res;
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty())
        {
            TreeNode cur = q.removeFirst();
            if(cur==null)
            {
                res.add(level);
                level = new LinkedList();
                if(q.isEmpty())
                    break;
                q.add(null);
            }
            else
            {
                level.add(cur.val);
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
            }
        }
        return res;
    }
}