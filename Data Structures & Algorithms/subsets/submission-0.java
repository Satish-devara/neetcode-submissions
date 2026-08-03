class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public void generateSubSet(int idx, int[] nums, ArrayList<Integer> current){
        ans.add(new ArrayList<>(current));

        for(int i  = idx; i < nums.length; i++){
            if(i > idx && nums[i] == nums[i-1]){
                continue;
            }

            current.add(nums[i]);
            generateSubSet(i+1, nums, current);
            current.remove(current.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {

            Arrays.sort(nums);
         ArrayList<Integer> list = new ArrayList<>();
         
        generateSubSet(0,nums, list);

        return ans;

    }
}
