class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        backTrack(0, 0, target, candidates, new ArrayList<>());
        return ans;
    }

    public void backTrack(int idx, int sum, int target, int[] candidates, List<Integer> current){
        if(sum == target){
            ans.add(new ArrayList<>(current));
            return;
        }

        

        for(int i = idx; i < candidates.length; i++){
            if(i > idx && candidates[i] == candidates[i-1]) continue;

            if(sum + candidates[i] > target) break;

            current.add(candidates[i]);
        backTrack(i + 1, sum + candidates[i], target,candidates, current);
        current.remove(current.size() - 1);
        }
        
    }
}
