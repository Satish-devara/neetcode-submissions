class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];

        int maxFreq = 0;
        int ans = 0;

        int left = 0;

        for(int right = 0; right < s.length(); right++){
            
            int currentClassIndex = s.charAt(right) - 'A';
            count[currentClassIndex]++;

            maxFreq = Math.max(maxFreq, count[currentClassIndex]);

            int window = right - left + 1;

            if(window - maxFreq > k){
                count[s.charAt(left)-'A']--;
                left++;
            }

        ans = Math.max(ans, right-left+1);

        }

        return ans;
    }
}
