class Solution {
    public static int time;
    LinkedList <List<Integer>> ans;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        time = 1;
        ans = new LinkedList();
        LinkedList [] graph = new LinkedList[n];
        for(int i=0;i<n;i++)
        {
            graph[i] = new LinkedList<Integer>();
            
        }
        for(List <Integer> edge : connections)
        {
            int u = edge.get(0);
            int v = edge.get(1);
            graph[u].add(v);
            graph[v].add(u);
            
        }
        boolean []visited = new boolean[n];
        int []dis = new int[n];
        int []low = new int[n];
        DFS(graph,dis,low,visited,0,-1);
        return ans;
    }
    public void DFS(LinkedList [] graph, int []dis, int []low, boolean []visited, int start, int parent)
    {
        visited[start] = true;
        low[start] = time;
        dis[start] = time;
        time++;
        LinkedList <Integer> neighs = graph[start];
        for(int neigh : neighs)
        {
            if(neigh==parent)
                continue;
            if(!visited[neigh])
            {
                DFS(graph,dis,low,visited,neigh,start);
                low[start] = Math.min(low[start],low[neigh]);
                if(dis[start]<low[neigh])
                {
                    LinkedList <Integer> list = new  LinkedList <Integer> ();
                    list.add(start);
                    list.add(neigh);
                    ans.add(list);
                }
            }
            else
            {
                low[start] = Math.min(dis[neigh],low[start]);
            }
        }
    }
}
