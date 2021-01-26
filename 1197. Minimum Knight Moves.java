class Solution {
    public int minKnightMoves(int a, int b) {
        LinkedList <Pair> q = new LinkedList<Pair>();
        HashSet <String> visited = new HashSet();
        int [] dx ={-1,1,2,2,1,-1,-2,-2}; 
        int [] dy ={2,2,1,-1,-2,-2,-1,1};
        Pair start = new Pair(0,0,0);
        q.add(start);
        visited.add("0,0");
        
        while(!q.isEmpty())
        {
            Pair next = q.pollFirst();
            
            if(next.x==a && next.y == b)
                return next.level;
            for(int i=0;i<8;i++)
            {
                int row = next.x+dx[i];
                int col = next.y+dy[i];
                String v = ""+row+","+col;
                System.out.println(v);
                if(!visited.contains(v) && (row)>=-1 && (col)>=-1)
                {
                    
                    Pair temp = new Pair(row,col,next.level+1);
                    q.add(temp);
                    visited.add(v);
                }
            }
        }
        return -1;
        
        
        
        
    }
}

class Pair
{
    Integer x,y,level;
    Pair(int a, int b,int l)
    {
        this.x = a;
        this.y = b;
        this.level = l;
    }
}
