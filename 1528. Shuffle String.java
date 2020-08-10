class Solution {
    public String restoreString(String s, int[] indices) {
        String ans = "";
        StringBuilder temp = new StringBuilder();
        
        int n = s.length();
        char []a = new char[n];
        for(int i =0;i<n;i++)
        {
            char c = s.charAt(i);
            a[indices[i]] = c;
        }
        for(int i =0;i<n;i++)
        {
            temp = temp.append(a[i]);
        }
        return new String(temp);
    }
}
