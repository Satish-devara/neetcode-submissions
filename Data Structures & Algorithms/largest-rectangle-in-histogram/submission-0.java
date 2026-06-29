class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Deque<Integer> stack = new ArrayDeque<>();

        int area = 0;

        for(int i = 0; i <= n; i++){
            while(!stack.isEmpty() && (i == n || heights[stack.peek()] >= heights[i])){
                int height =  heights[stack.pop()];
                int widht  = stack.isEmpty()? i : i - stack.peek() -1;

                area = Math.max(area, height * widht); 
            }

            stack.push(i);
        }

        return area;
    }
}
