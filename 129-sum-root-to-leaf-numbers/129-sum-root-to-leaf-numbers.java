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
    public int sumNumbers(TreeNode root) {
        ArrayList<String> path = new ArrayList();
        getPaths(root,path,"");
        int res = 0;
        
        for(String s : path)
        {
            int cur = Integer.parseInt(s);
            res = res+cur;
        }
        return res;
        
        
    }
    public void getPaths(TreeNode root, ArrayList<String> path, String s)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
            s = s+""+root.val;
            path.add(s);
            return;
        }
        
         s = s+""+root.val;
        getPaths(root.left,path,s);
        getPaths(root.right,path,s);
        
        return;
        
        
    }
}