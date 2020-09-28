/*Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 

But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3
 

Follow up: Solve it both recursively and iteratively.*/
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        
        return isSysm(root.left,root.right);
        
    }
    public boolean isSysm(TreeNode left, TreeNode right)
    {
        
        if(left==null && right==null)
            return true;
        if(left==null || right==null)
            return false;
        return (left.val == right.val) && isSysm(left.left,right.right) && isSysm(left.right,right.left);
    }
}
