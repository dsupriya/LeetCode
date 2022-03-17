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
    public int rob(TreeNode root) {
        pair ans = solve(root);
        return Math.max(ans.withRoot,ans.noRoot);
        
    }
    public pair solve(TreeNode root)
    {
        if(root==null)
        {
            return new pair(0,0);
        }
        if(root.left==null && root.right==null)
        {
            return new pair(root.val,0);
        }
        pair left = solve(root.left);
        pair right = solve(root.right);
        
        int withRoot = root.val + left.noRoot + right.noRoot;
        int withOutRoot = Math.max(left.withRoot,left.noRoot) + Math.max(right.withRoot,right.noRoot);
        return new pair(withRoot,withOutRoot);
    }
    
}
class pair
{
    int withRoot, noRoot;
    pair(int a, int b)
    {
        this.withRoot  = a;
        this.noRoot = b;
    }
}