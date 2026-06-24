class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int ans = 0;
        for(int num : set){
            
            if(!set.contains(num-1)){
                int count = 1;
            int req = num;
                
                while(set.contains(req+1)){
                    count++;
                    req++;
                }
                ans = Math.max(ans, count);
            }

            
        }

        return ans;
    }
}