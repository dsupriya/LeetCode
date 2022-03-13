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
    public boolean isValidBST(TreeNode root) {
        
    if(root==null)
            return true;
        return BST(root,  null,null);
       
        
    }
    public boolean BST(TreeNode root, Integer left_val, Integer right_val)
    {
        if(root==null)
            return true;
        if(left_val!=null && (root.val)<=(left_val))
           return false;
        if(right_val!=null && (root.val)>=(right_val))
           return false;
        boolean l = BST(root.left,left_val,root.val);
        boolean r = BST(root.right,root.val,right_val);
        return l&&r;
        
        /* if(root==null)
            return true;
        if(min!=null && root.val<=min)
            return false;
        if(max!=null && root.val>=max)
            return false;
        boolean l = find(root.left,min,root.val);
        boolean r = find(root.right,root.val,max);
        return l&&r;*/
        
    }
}