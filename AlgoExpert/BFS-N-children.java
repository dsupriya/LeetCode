import java.util.*;

class Program {
  // Do not edit the class below except
  // for the breadthFirstSearch method.
  // Feel free to add new properties
  // and methods to the class.
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> breadthFirstSearch(List<String> array) {
      // Write your code here.
			LinkedList <Node> q = new LinkedList();
			
			q.add(this);
			while(!q.isEmpty())
			{
				Node cur = q.removeFirst();
				array.add(cur.name);
				Iterator <Node>itr = cur.children.iterator();
				while(itr.hasNext())
					q.add(itr.next());
				
			}
			
			
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}
