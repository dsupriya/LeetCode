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
    public boolean isCousins(TreeNode root, int x, int y) {
        int []a = new int[2];
        int []b = new int[2];
        DFS(root,x,a,0,0);
        DFS(root,y,b,0,0);
        if(a[0]==0||b[0]==0||a[1]==0||b[1]==0)
            return false;
        if(a[0]==b[0] || a[1]!=b[1])
            return false;
        else
            return true;
        
        
    }
    public static void DFS(TreeNode root, int x, int[]a, int level, int parent)
    {
        if(root==null)
            return;
        if(root.val==x)
        {
            a[0]=parent;
            a[1]=level;
            return;
        }
        else
        {
            DFS(root.left,x,a,level+1,root.val);
            DFS(root.right,x,a,level+1,root.val);
            return;
        }
        
    }
    
    
    }
