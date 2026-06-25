class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int l = 0;
        int leftMax = height[0];

        int r = n-1;
        int rightMax = height[r];

        int ans = 0;
        while(l < r){
            if(leftMax < rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                ans += leftMax - height[l];
            }else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                ans += rightMax - height[r];
            }
        }
        return ans;
    }
}
