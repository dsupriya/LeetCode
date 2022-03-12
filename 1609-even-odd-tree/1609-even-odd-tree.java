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
    public boolean isEvenOddTree(TreeNode root) { 
        
        LinkedList <TreeNode> q = new LinkedList();
        q.add(root);
        q.add(null);
        int level = 0;
        LinkedList <TreeNode> node = new LinkedList();
        while(!q.isEmpty())
        {
           TreeNode cur = q.removeFirst();
           if(cur == null)
           {
               node = new LinkedList();
               if(q.isEmpty())
                   break;
               q.add(null);
               level++;
           }
            else
            {
                if(!checkConditions(node,cur,level))
                    return false;
                node.add(cur);
                if(cur.left!=null)
                    q.add(cur.left);
                 if(cur.right!=null)
                    q.add(cur.right);
                
            }
        }
        return true;
        
    }
    public boolean checkConditions(LinkedList<TreeNode> list, TreeNode cur, int level)
    {
        if(list.isEmpty())
        {
            if(level%2==0)
                return (cur.val%2==1); 
            else
                return (cur.val%2==0);
             
        }
        if(level%2==0)
        {
            
            return (cur.val%2==1) && (list.getLast().val < cur.val);
        }
        else
        {
            return (cur.val%2==0) && (list.getLast().val > cur.val);
        }
    }
    
}