class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap <String,String> hm = new HashMap();
        
        for(List <String> path : paths)
        {
            
            hm.put(path.get(0),path.get(1));
        }
        String next = new String();
        for(Map.Entry <String,String>e : hm.entrySet())
        {
            next = e.getValue();
            if(!hm.containsKey(next))
                return next;
        }
        System.out.println(hm);
        return next;
    }
}
