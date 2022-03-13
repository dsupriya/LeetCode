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
    public boolean findTarget(TreeNode root, int k) {
        
        HashSet <Integer> hs = new HashSet();
        return solve(root,k,hs);
        
    }
    public boolean solve(TreeNode root, int k, HashSet <Integer> hs){
        if(root==null)
            return false;
        int rem = k - root.val;
        if(hs.contains(rem))
            return true;
        else{
            hs.add(root.val);
            return solve(root.left,k,hs) || solve(root.right,k,hs);
        }
    }
}