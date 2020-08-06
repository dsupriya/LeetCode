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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        //int t = findmax(nums,0,nums.length-1);
        return build(nums,0,nums.length-1);
        
    }
    public static TreeNode build(int[] nums, int s, int e)
    {
        if(s>e)
            return null;
        int cur = findmax(nums,s,e);
        
        
        TreeNode root = new TreeNode(nums[cur]);
        if(s==e)
            return root;
        root.left = build(nums,s,cur-1);
        root.right = build(nums,cur+1,e);
        return root;
    }
    public static int findmax(int[] nums, int s, int e)
    {
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(int i=s;i<=e;i++)
        {
            if(max<nums[i])
            {
                max = nums[i];
                ans = i;
            }   
        }
        return ans;
    }
}
