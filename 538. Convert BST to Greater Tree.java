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
    public static int sum;
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        convert(root);
        return root;
    }
    public static void convert(TreeNode root)
    {
        
        if(root==null)
            return;
        convert(root.right);
        if(sum==0&&root.right==null&&root.left==null)
        {
            sum=root.val;
        }
        else
        {
            root.val = root.val+sum;
            sum=root.val;
        }
        convert(root.left);
            
    }
}
