class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backTrack(0, nums);
        return ans;
    }


    public void backTrack(int idx,  int[] nums){
        if(idx == nums.length){
            List<Integer> current = new ArrayList<>();
            for(int num : nums) current.add(num);
            ans.add(new ArrayList<>(current));
            return;
        }

        for(int i = idx; i < nums.length; i++){
             swap(nums, idx, i);
             backTrack(idx + 1, nums);
             swap(nums, idx, i);
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp; 
    }
}
