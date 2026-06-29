class Solution {
    public int evalRPN(String[] s) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < s.length; i++){
            if(s[i].equals("+") ||s[i].equals("-") || s[i].equals("*")|| s[i].equals("/")){
                int a = st.pop();
                int b = st.pop();
                int c = 0;
                if(s[i].equals("+")){
                    c = a + b;
                }else if(s[i].equals("-")){
                    c = b-a;
                }else if(s[i].equals("*")){
                    c = a*b;
                }else{
                    c = b/a;
                }

                st.push(c);
            }else{
                st.push(Integer.parseInt(s[i]));
            }
        }

        return st.pop();
    }
}
