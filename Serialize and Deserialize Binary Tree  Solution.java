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
    public static int start;
    public String serialize(TreeNode root) {
        //System.out.println(MySerialize(root));
        return new String (MySerialize(root));
    }
    public StringBuilder MySerialize(TreeNode root)
    {
        if(root==null)
        {
            return new StringBuilder("#,");
        }
        StringBuilder res = new StringBuilder();
        res.append(root.val+",");
        StringBuilder l = MySerialize(root.left);
        res.append(l);
        StringBuilder r = MySerialize(root.right);
        res.append(r);
        return res;
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String [] ch = data.split(",");
        start = 0;
        return MyDeserialize(ch);
        
    }
    public TreeNode MyDeserialize(String []ch) {
        int n = ch.length;
        if(start>=n)
            return null;
        if(ch[start].equals("#"))
            return null;
        TreeNode root = new TreeNode(Integer.parseInt(""+ch[start]));
        start++;
        root.left = MyDeserialize(ch);
        start++;
        root.right = MyDeserialize(ch);
        return root;
        
    }
    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
