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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return 0;
        return pathSum(root.left,targetSum) + pathSum(root.right,targetSum) + pathSum2(root,targetSum);
        
    }
    
    public int pathSum2(TreeNode root, int target)
    {
        if(root==null)
            return 0;
        int count = 0;
        if(target== root.val)
            count++;
        int rem = target - root.val;
        count = count + pathSum2(root.left,rem);
        count = count + pathSum2(root.right,rem);
        return count;
        
    }
}