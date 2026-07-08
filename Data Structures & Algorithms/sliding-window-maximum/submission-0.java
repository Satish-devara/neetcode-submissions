class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        int[] ans = new int[n-k+1];

        

        Deque<Integer> stack = new LinkedList<>();
        int l = 0; 
        int r = 0;

        while( r < n){
            while(!stack.isEmpty() && nums[stack.getLast()]< nums[r]){
                stack.removeLast();
            }

            stack.addLast(r);

            if(l > stack.getFirst()){
                stack.removeFirst();
            }

            if((r+1) >= k){
              ans[l] = nums[stack.getFirst()];
              l++ ; 
            }

            r++;
        }
        return ans;
    }
}
