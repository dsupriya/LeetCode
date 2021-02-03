class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Stack <Integer> s = new Stack();
        boolean []visited = new boolean[n];
        s.push(0);
        visited[0] = true;
        
        while(!s.isEmpty())
        {
            int cur = s.pop();
            List <Integer> neigh = rooms.get(cur);
            for(int i :neigh)
            {
                if(visited[i]==false)
                {
                    visited[i] = true;
                    s.push(i);
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
                return false;
        }
        return true;
        
    }
}
