class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int ans = 0;

        for(int num : set){
            int req = num;

            int count = 1;

            if(set.contains(req-1)){
                count++;
                while(set.contains(req+1)){
                    count++;
                    req++;
                }
            }

            ans = Math.max(ans, count);
        }

        return ans;
    }

}
