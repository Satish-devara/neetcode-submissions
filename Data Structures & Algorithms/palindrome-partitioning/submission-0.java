class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backTrack(new ArrayList<>(), s, 0);
        return ans;
    }

    public void backTrack(List<String> current, String s, int idx){
        if(idx >= s.length()){
            ans.add(new ArrayList<>(current));
            return;
        }

        for(int i = idx; i < s.length(); i++){
            if(isPali(s, idx, i)){
                current.add(s.substring(idx, i+1));
                backTrack(current, s, i+1);
                current.remove(current.size() - 1);
            }
        }
    }

    public boolean isPali(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}
