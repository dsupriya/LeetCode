/*Min distance between two given nodes of a Binary Tree 
Medium Accuracy: 45.05% Submissions: 27406 Points: 4
Given a binary tree and two node values your task is to find the minimum distance between them.

Example 1:*/

// { Driver Code Starts
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Main {
    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            String[] ab = br.readLine().trim().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            GfG g = new GfG();
            System.out.println(g.findDist(root, a, b));
        }
    }
}
// } Driver Code Ends


// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    int findDist(Node root, int a, int b) {
        Node lca = LCA(root,a,b);
        int dis_a = distance(root,a,0);
        int dis_b = distance(root,b,0);
        int dis_lca = distance(root,lca.data,0);
        return (dis_a+dis_b)-(2*dis_lca);
        
        
    }
    Node LCA(Node root, int a, int b)
    {
        if(root==null)
            return null;
        if(root.data==a || root.data==b)
            return root;
        Node l = LCA(root.left,a,b);
        Node r = LCA(root.right,a,b);
        if(l!=null && r!=null)
            return root;
        else if(l!=null)
            return l;
        else
            return r;
    }
    int distance(Node root, int a, int d)
    {
        if(root==null)
            return -1;
        if(root.data== a)
            return d;
        int l = distance(root.left,a,d+1);
        if(l!=-1)
            return l;
        else 
            return distance(root.right,a,d+1);
        
    }
}
