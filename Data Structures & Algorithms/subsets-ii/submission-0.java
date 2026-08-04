class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backTrack(0, new ArrayList<>(), nums);
        return ans;
    }


    public void backTrack(int idx, List<Integer> current, int[] nums){
        ans.add(new ArrayList<>(current));

        for(int i = idx; i < nums.length; i++){
            
            if(i > idx && nums[i] == nums[i-1]) continue;

            current.add(nums[i]);
            backTrack(i+1, current, nums);
            current.remove(current.size() -1);
        }
    }
}
