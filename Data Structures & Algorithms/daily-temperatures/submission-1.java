class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        Arrays.fill(res, 0);

        for(int i = 0; i < n; i++){
            int count = 0;
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int indexTop = st.pop();
                res[indexTop] =  i - indexTop; 
            }

            st.push(i);
        }

        return res;
    }
}
