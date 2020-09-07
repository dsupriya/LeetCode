/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
            return "X,";
        String left = serialize(root.left);
        String right = serialize(root.right);
        return ""+root.val+","+left+right;
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList <String> q = new LinkedList<String>();
        String [] str = data.split(",");
        q.addAll(Arrays.asList(str));
        return deser(q);
    }
    public static TreeNode deser(LinkedList <String> q)
    {
        if(q.isEmpty())
            return null;
        String temp = q.poll();
        if(temp==null || temp.equals("X"))
            return null;
        TreeNode root = new TreeNode(Integer.parseInt(temp));
        root.left = deser(q);
        root.right = deser(q);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
