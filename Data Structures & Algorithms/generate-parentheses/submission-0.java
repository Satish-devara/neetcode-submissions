class Solution {
    List<String> ans;
    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backTrack(0, 0, n, stack);
        return ans;
    }

    public void backTrack(int open, int close,  int n, StringBuilder stack){
        
            if(open == close && open == n){
               ans.add(stack.toString());
            return;
            }
            

        if(open < n){
            stack.append("(");
            backTrack(open+1, close, n, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
        

        if(close < open){
            stack.append(")");
            backTrack(open, close + 1, n, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
    }
}
