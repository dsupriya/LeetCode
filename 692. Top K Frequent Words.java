import java.util.*;
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap <String, Integer> hm =new  HashMap <String, Integer>();
        String t ="";
        int n = words.length;
        for(int i=0;i<n;i++)
        {
            t = words[i];
            if(hm.containsKey(t))
            {
                int m= hm.get(t);
                hm.put(t,m+1);
            }
            else
                hm.put(t,1); 
        }
         List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
                
            {   if(o2.getValue() ==o1.getValue())
                    return ((o1.getKey()).compareTo(o2.getKey()));
                else
                return (o2.getValue()).compareTo(o1.getValue()); 
            } 
        });
        LinkedList <String>ans = new  LinkedList <String>();
        
        int i = 0;
        for (Map.Entry<String, Integer> aa : list) { 
            if(i==k)
                break;
            //temp.put(aa.getKey(), aa.getValue()); 
            ans.add(aa.getKey());
            i++;
        } 
        
        return ans;
    }
}
