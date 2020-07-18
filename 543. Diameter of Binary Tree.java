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
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null)
            return 0;
        int hl = height(root.left);
        int hr = height(root.right);
        
        int dl = diameterOfBinaryTree(root.left);
        int dr = diameterOfBinaryTree(root.right);
        
        return Math.max(hl+hr, Math.max(dl,dr));
        
    }
    public static int height(TreeNode root)
    {
        if(root==null)
            return 0;
        else 
            return 1+
            Math.max(height(root.left),height(root.right));
    }
}
