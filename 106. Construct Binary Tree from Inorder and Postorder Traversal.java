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
     int pre =0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        pre = n-1;
        HashMap <Integer,Integer> hm = new HashMap <Integer,Integer>();
        createMap(hm,inorder);
        
        
       
        return build(postorder,hm,0,n);
        
    }
    public void reverse(int []a)
    {
        int n = a.length;
        for(int i=0,j=n-1;i<n/2;i++,j--)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        
    }
     public void createMap  (HashMap <Integer,Integer> hm, int []inorder)
    {
         int n = inorder.length;
        for(int i=0;i<n;i++)
        {
            hm.put(inorder[i],i);
        }
    }
    public TreeNode build(int []preorder, HashMap <Integer,Integer> hm,int l, int r)
    {
        if(l==r)
            return null;
        TreeNode root = new TreeNode(preorder[pre]);
        
        int mid = hm.get(root.val);
        pre--;
        root.right = build(preorder,hm,mid+1,r);
        root.left = build(preorder,hm,l,mid);
        
        return root;
    }
}
