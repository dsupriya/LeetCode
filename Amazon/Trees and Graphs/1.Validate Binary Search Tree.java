/*Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.*/


class Solution {
    public boolean isValidBST(TreeNode root) {
        return isBST(root,null,null);
        
    }
    public boolean isBST (TreeNode root, Integer low, Integer high)
    {
        if(root==null)
            return true;
        int val = root.val;
        if(low!=null && val<=low) return false;
        if(high!=null && high<=val) return false;
        if(!isBST(root.left,low,val)) return false;
        if(!isBST(root.right,val,high)) return false;
        return true;
        
    }
}
