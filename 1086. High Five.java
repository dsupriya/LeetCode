class Solution {
    public int[][] highFive(int[][] items) {
        TreeMap <Integer, PriorityQueue <Integer>> hm = new   TreeMap <Integer, PriorityQueue <Integer>> ();
        int n = items.length;
       
        int id, score, count;
        
        for(int i=0;i<n;i++)
        {
            id = items[i][0];
            score = items[i][1];
            PriorityQueue <Integer>list = hm.getOrDefault(id, new PriorityQueue<Integer>());
            if(list.size()<5)
            {
                list.add(score);
            }
            else if(list.peek()<score)
            {
                list.poll();
                list.add(score);
                
            }
            hm.put(id,list);
            
        }
        
        int [][]ans = new int[hm.size()][2];
        PriorityQueue <Integer> temp;
        int avg;
        int k =0;
        for(Map.Entry <Integer,PriorityQueue <Integer>> e: hm.entrySet())
        {
            id = (int)e.getKey();
            temp = e.getValue();
            Iterator <Integer>itr = temp.iterator();
            avg = 0;
            while(itr.hasNext())
                avg=avg+itr.next();
            avg = (int)(avg/5);
            ans[k][0] = id;
            ans[k][1] = avg;
            k++;
            
        }
        
        System.out.println(hm);
        return ans;
        
        
    }
}
