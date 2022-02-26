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
            for(Node neigh_old : neigh)
            {
                //System.out.println(hm);
                if(!hm.containsKey(neigh_old))
                {
                    Node new_next_neigh = new Node(neigh_old.val,  new ArrayList<Node>());
                    Node new_start = hm.get(cur);
                    new_start.neighbors.add(new_next_neigh);
                    queue.add(neigh_old);
                    hm.put(neigh_old,new_next_neigh);
                    
                }
                else
                {
                    Node next = hm.get(neigh_old);
                    Node new_start = hm.get(cur);
                    new_start.neighbors.add(next);
                    
                    
                }
            }
            
        }
        return hm.get(node);
        
    }
}

// Idea is , create HashTable with key as old node and value as new node
// traverse the graph bfs, create nodes for each neigh, now to link with previous node, fetch that detials from hm