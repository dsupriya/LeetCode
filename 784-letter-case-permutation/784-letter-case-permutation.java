import java.util.*;
class Solution {
    public List<String> letterCasePermutation(String s) {
        List <String> res = new LinkedList();
        String output = new String (s);
        int i = 0;
        getPermutations(s,output,i,res);
        return res;
        
    }
    
    public void getPermutations(String input, String output, int i,  List <String> res)
    {
        if(i>=input.length())
        {
            res.add(output);
            return;
        }
        char ch = input.charAt(i);
        if(Character.isDigit(ch))
        {
            getPermutations(input,output,i+1,res);
            return;
        }
        String op1 = new String(output);
        String op2 = new String(output);
        if(Character.isLowerCase(ch))
        {
            if(i==output.length()-1) // converting last char
                op2 = output.substring(0,i)+ output.substring(i,i+1).toUpperCase();
            else
                op2 = output.substring(0,i)+ output.substring(i,i+1).toUpperCase()+ output.substring(i+1);
        }
        else 
        {
            if(i==output.length()-1)
                op2 = output.substring(0,i)+ output.substring(i,i+1).toLowerCase();
            else
                op2 = output.substring(0,i)+ output.substring(i,i+1).toLowerCase()+ output.substring(i+1);
        }
        getPermutations(input,op1,i+1,res);
        getPermutations(input,op2,i+1,res);
        return;
        
        
    }
}