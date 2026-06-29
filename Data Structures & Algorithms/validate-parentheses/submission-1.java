class Solution {
    public boolean isValid(String ss) {
        Stack<Character> s = new Stack<>();

        for(Character c : ss.toCharArray()){
                if(c == '(' || c == '{' || c == '['){
                    s.push(c);
                }else{

                    if(s.isEmpty()) return false;
                    char top = s.pop();

                    if(c == ')' && top != '(' ||
                    c == '}' && top != '{' ||
                    c == ']' && top != '['){
                        return false;
                    }
                } 
        }

        return s.isEmpty();
    }
}
