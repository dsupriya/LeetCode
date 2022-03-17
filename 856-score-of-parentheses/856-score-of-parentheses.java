class Solution {
    public int scoreOfParentheses(String s) {
        Stack <Integer> stack= new Stack();
        int score = 0;
        for (char c : s.toCharArray())
        {
            if(c=='('){
                stack.push(score);
                score = 0;
                
            }
            else
            {
                score = stack.pop() + Math.max(1,2*score);
            }
        }
        return score;
        
    }
}