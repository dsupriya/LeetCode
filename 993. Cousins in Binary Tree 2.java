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
        
        
        LinkedList <TreeNode> q = new LinkedList();
        boolean s,c;
        s=c=false;
        q.add(root);
        while(!q.isEmpty())
        {
            s=c=false;
            int  n = q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode cur = q.pollFirst();
                if(cur==null)
                    s=false;
                else 
                {
                    if(cur.val == x|| cur.val==y)
                    {
                        if(c==false)
                            s=c=true;
                        else return !s;
                    }
                      if(cur.left!=null) 
                    q.add(cur.left);
                if(cur.right!=null) 
                    q.add(cur.right);
                q.add(null);
                        
                }
              
            }
            if(c)
                return false;
                
                
            
        }
        return false;
        
    }
}
