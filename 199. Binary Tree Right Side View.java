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
    public List<Integer> rightSideView(TreeNode root) {
        
        LinkedList <TreeNode> q=new LinkedList<TreeNode>();
        LinkedList <Integer> ans=new LinkedList<Integer>();
        if(root==null)
            return ans;
        q.add(root);
        q.add(null);
        TreeNode prev = root;
        while(q.isEmpty()==false)
        {
            TreeNode temp = q.remove(0);
            if(temp==null)
            {
                ans.add(prev.val);
                if(q.isEmpty())
                    return ans;
                q.add(null);
            }
            else
            {
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                prev = temp;
                
            }
        }
        return ans;
        
    }
}
