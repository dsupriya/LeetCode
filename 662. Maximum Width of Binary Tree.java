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
    public int widthOfBinaryTree(TreeNode root) {
        LinkedList <Pair> q = new LinkedList <Pair>();
        if(root==null)
            return 0;
        q.add(new Pair(root,0));
        q.add(null);
        LinkedList <Pair> level = new LinkedList<Pair>();
        int max = -1;
        while(!q.isEmpty())
        {
            Pair cur = q.poll();
            if(cur==null)
            {
                max = Math.max(level.getLast().index- level.getFirst().index+1,max);
                if(q.isEmpty())
                    return max;
                level = new LinkedList<Pair>();
                q.add(null);
            }
            else
            {
                level.add(cur);
                if(cur.node.left!=null)
                {
                    q.add(new Pair(cur.node.left, cur.index*2));
                }
                 if(cur.node.right!=null)
                {
                    q.add(new Pair(cur.node.right, cur.index*2 +1));
                }
                
                
            }
            
        }
        return max;
        
    }
}
class Pair
{
    int index;
    TreeNode node;
    Pair(TreeNode n,int i )
    {
        this.node = n;
        this.index = i;
    }
}
