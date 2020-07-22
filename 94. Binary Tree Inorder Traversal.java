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
    public List<Integer> inorderTraversal(TreeNode root) {
        /*1) Create an empty stack S.
2) Initialize current node as root
3) Push the current node to S and set current = current->left until current is NULL
4) If current is NULL and stack is not empty then 
     a) Pop the top item from stack.
     b) Print the popped item, set current = popped_item->right 
     c) Go to step 3.
5) If current is NULL and stack is empty then we are done.*/
        LinkedList <Integer> ans = new  LinkedList <Integer>();
        Stack <TreeNode> s = new Stack<TreeNode>();
        TreeNode cur = root;
        while(cur!=null || s.size()>0)
        {
            while(cur!=null)
            {
                s.push(cur);
                cur=cur.left;
            }
            cur = s.pop();
            ans.add(cur.val);
            cur = cur.right;
        }
        return ans;
        
        
        
    }
}
