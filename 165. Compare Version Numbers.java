class Solution {
    public List<List<String>> groupAnagrams(String[] a) {
        HashMap <String, LinkedList<String>> hm = new HashMap <String, LinkedList<String>>();
        List<List<String>> ans = new LinkedList<List<String>>();
        
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            char [] temp = a[i].toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            if(hm.containsKey(key))
            {
                LinkedList <String> q = hm.get(key);
                q.add(a[i]);
                hm.put(key,q);
            }
            else
            {
                LinkedList <String> list = new LinkedList <String>();
                list.add(a[i]);
                hm.put(key,list);
            }
        }
        System.out.println(hm);
        for(Map.Entry e : hm.entrySet())
        {
            LinkedList <String> list = (LinkedList <String>)e.getValue();
            ans.add(list);
            
        }        
        return ans;
                 
            
        
    }
}
