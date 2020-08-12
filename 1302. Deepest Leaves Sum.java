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
    public int deepestLeavesSum(TreeNode root) {
        int h = height(root);
        return sum(root,h);
        
    }
    public static int height(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static int sum(TreeNode root, int h)
    {
        if(root==null || h<=0)
            return 0;
        if(h==1)
            return root.val;
        return sum(root.left,h-1)+sum(root.right,h-1);
    }
}
