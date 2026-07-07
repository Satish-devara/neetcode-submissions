class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();

        int ans = 0;
        int left = 0;
        int right = 0;
        while(left <= right && right < s.length()){

            if(mpp.containsKey(s.charAt(right))){
                left = Math.max(left, mpp.get(s.charAt(right))+1);
            }

            mpp.put(s.charAt(right), right);

            ans = Math.max(ans, right-left+1);
            right++;
        }

        return ans;
    }
}
