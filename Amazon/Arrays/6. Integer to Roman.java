class Solution {
    public String intToRoman(int num) {
        
       
        Pair []hm = new Pair[13];
        getPair(hm);
        StringBuffer ans = new StringBuffer();
        int start =0;
        while(num>0)
        {
            for(int i=start;i<13;i++)
            {
                if(num>=hm[i].key)
                {
                    start = i;
                    break;
                }
            }
            ans.append(hm[start].value);
            num = num - hm[start].key;
            
        }
        return new String(ans);
        
    }
    public void getPair(Pair []hm)
    {
        hm [0] = new Pair(1000,"M");
        hm [1] = new Pair(900,"CM");
        hm [2] = new Pair(500,"D");
        hm [3] = new Pair(400,"CD");
        hm [4] = new Pair(100,"C");
        hm [5] = new Pair(90,"XC");
        hm [6] = new Pair(50,"L");
        hm [7] = new Pair(40,"XL");
        hm [8] = new Pair(10,"X");
        hm [9] = new Pair(9,"IX");
        hm [10] = new Pair(5,"V");
        hm [11] = new Pair(4,"IV");
        hm [12] = new Pair(1,"I");
        
    }
}
class Pair
{
    int key;
    String value;
    Pair(int k, String v)
    {
        this.key = k;
        this.value = v;
    }
}
