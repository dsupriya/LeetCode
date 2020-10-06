class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        
        
        List<List<String>> ans = new LinkedList<List<String>>();
        TreeSet <String> hs = new TreeSet<String>();
        TreeMap <Integer,HashMap<String,Integer>> hm = new TreeMap <Integer,HashMap<String,Integer>>();
        Iterator itr = orders.iterator();
        ArrayList <String> temp;
        int tableNo;
        String food;
        HashMap <String,Integer>count;
        while(itr.hasNext()) 
        {
            temp = (ArrayList<String>) itr.next();
            tableNo = Integer.parseInt(temp.get(1));
            food = temp.get(2);
            hs.add(food);
            if(hm.containsKey(tableNo))
            {
                count = hm.get(tableNo);
                int val = count.getOrDefault(food,0);
                count.put(food,val+1);
                hm.put(tableNo,count);
                
            }
            else
            {
                count = new HashMap <String,Integer>();
                count.put(food,1);
                hm.put(tableNo,count);
            }
        }
        LinkedList <String> header = new LinkedList<String>();
        header.add("Table");
        header.addAll(hs);
        ans.add(header);
        for(Map.Entry e : hm.entrySet())
        {
            header = new LinkedList<String>();
            tableNo = (int)e.getKey();
            count = (HashMap<String,Integer>)e.getValue();
            header.add(""+tableNo);
            itr = hs.iterator();
            while(itr.hasNext())
            {
                String foodItem = (String)itr.next();
                int val = count.containsKey(foodItem) ? count.get(foodItem) : 0;
                header.add(""+val);
                
                
            }
            ans.add(header);
        }
        
        itr = hs.iterator();
       
        return ans;
        
        
    }
}
