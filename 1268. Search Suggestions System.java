class TrieNode
{
    TrieNode [] children;
    LinkedList <String> suggestion;
    TrieNode()
    {
        children = new TrieNode[26];
        suggestion = new LinkedList<String>();
        
    }
}
class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        
        TrieNode root = new TrieNode();
        LinkedList <List<String>> ans = new LinkedList();
        
        for(String product : products)
        {
            TrieNode p = root;
            for(char c : product.toCharArray())
            {
                int index = c-'a';
                if(p.children[index]==null)
                    p.children[index] = new TrieNode();
                p = p.children[index];
                if(p.suggestion.size()<3)
                    p.suggestion.add(product);
            }
        }
        TrieNode p = root;
        for(int i=0;i<searchWord.length();i++)
        {
            char c = searchWord.charAt(i);
            int index = c-'a';
            if(p.children[index]==null)
            {
               for(int j=i;j<searchWord.length();j++)
                   ans.add(new LinkedList<String>());
                break;
               
                
            }
            p=p.children[index];
            ans.add(p.suggestion);
            
                
        }
        return ans;
        
        
    }
}
