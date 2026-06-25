class Solution {
    public int maxArea(int[] heights) {
        int ans = 0;

        int l = 0;
        int r = heights.length-1;

        while(l < r){

            int length = (r - l);
            if(heights[l] < heights[r]){
                ans = Math.max(ans, length * heights[l]);
                    l++;
                }else{
                    ans = Math.max(ans, length * heights[r]);
                    r--;
                }
            }
            return ans;
        }

        
    }

