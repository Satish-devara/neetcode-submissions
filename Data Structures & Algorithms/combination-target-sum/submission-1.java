class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        backTrack(0,0, nums, target, list);

        return ans;
    }


    public void backTrack(int idx, int sum, int[] nums, int target, List<Integer> current){

        if(sum == target){
            ans.add(new ArrayList<>(current));
            return;
        }

        for(int i = idx; i < nums.length; i++){
            if(sum + nums[i] > target){
                return;
            }

            current.add(nums[i]);
            backTrack(i, sum + nums[i], nums, target, current);
            current.remove(current.size() -1);
        }
    }
}
