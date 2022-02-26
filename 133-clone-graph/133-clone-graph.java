/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)
            return null;
        
        
        HashMap <Node,Node> hm = new HashMap();
        LinkedList <Node> queue = new LinkedList();
        HashSet <Integer> visited = new HashSet();
        
        Node start = new Node(node.val,  new ArrayList<Node>());
        queue.add(node);
        hm.put(node,start);
        
        while(!queue.isEmpty()){
            Node cur = queue.removeFirst();
           
            List<Node> neigh = cur.neighbors;
            for(Node n : neigh)
            {
                //System.out.println(hm);
                if(!hm.containsKey(n))
                {
                    Node next = new Node(n.val,  new ArrayList<Node>());
                    Node new_start = hm.get(cur);
                    new_start.neighbors.add(next);
                    queue.add(n);
                    hm.put(n,next);
                    
                }
                else
                {
                    Node next = hm.get(n);
                    Node new_start = hm.get(cur);
                    new_start.neighbors.add(next);
                    
                    
                }
            }
            
        }
        return hm.get(node);
        
    }
}