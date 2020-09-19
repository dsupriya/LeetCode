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
        
        LinkedList <TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> answer = new  LinkedList<List<Integer>>();
        LinkedList<Integer>level = new LinkedList<Integer>();
        if(root==null)
            return answer;
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();
            if(temp==null)
            {
                answer.add(level);
                if(q.isEmpty()) break;
                level = new LinkedList<Integer>();
                q.add(null);
            }
            else
            {
                level.add(temp.val);
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }
        }
        return answer;
    }
}
