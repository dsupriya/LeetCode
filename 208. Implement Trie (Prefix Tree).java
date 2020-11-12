class TrieNode
{
    TrieNode[] children;
    boolean end;
    public TrieNode() {
        children = new TrieNode[26];
    }
    
}
class Trie {

    /** Initialize your data structure here. */
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        int n = word.length();
        int index = 0;
        TrieNode p = root;
        for(int i=0;i<n;i++)
        {
            index = word.charAt(i)-'a';
            System.out.print(index+" ");
            if(p.children[index]==null)
                p.children[index] = new TrieNode();
            p = p.children[index];
        }
        p.end = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        int n = word.length();
        int index = 0;
        TrieNode p = root;
        for(int i=0;i<n;i++)
        {
            index = word.charAt(i)-'a';
            System.out.print(index+" ");
            if(p.children[index]==null)
                return false;
            p = p.children[index];
        }
        return (p!=null && p.end==true);
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String word) {
        int n = word.length();
        int index = 0;
        TrieNode p = root;
        for(int i=0;i<n;i++)
        {
            index = word.charAt(i)-'a';
            if(p.children[index]==null)
                return false;
            p = p.children[index];
        }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
