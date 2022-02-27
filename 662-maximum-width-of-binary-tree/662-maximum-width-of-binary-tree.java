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
        LinkedList <Node> q = new LinkedList();
        Node start = new Node(root,1);
        q.add(start);
        q.add(null);
        LinkedList <Node> level = new LinkedList();
        
        int max = -1;
        
        while(!q.isEmpty())
        {
            Node cur = q.removeFirst();
            if(cur==null)
            {
                max = Math.max(max, level.getLast().index - level.getFirst().index +1);
                if(q.isEmpty())
                    return max;
                level = new LinkedList();
                q.add(null);
                
            }
            else
            {
                level.add(cur);
                if(cur.node.left!=null)
                {
                    int left_index = 2*cur.index;
                    Node left_node = new Node(cur.node.left, left_index);
                    q.add(left_node);
                }
                if(cur.node.right!=null)
                {
                    int right_index = 2*cur.index + 1;
                    Node right_node = new Node(cur.node.right, right_index);
                    q.add(right_node);
                }
            }
        }
        return max;
        
        
        
    }
}
class Node {
    TreeNode node;
    int index;
    Node(TreeNode node, int index)
    {
        this.node = node;
        this.index = index;
    }
}


// main idea is
/* Store index of each node and use one more linkedlist to store nodes of that level
so that we can get first and last node and simply do : last.index-first.index+1*/