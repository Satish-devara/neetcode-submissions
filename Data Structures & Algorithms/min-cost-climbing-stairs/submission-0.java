class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        if(n==1){
            return cost[0];
        }

        if(n == 2){
            return cost[0] > cost[1]?cost[1]:cost[0];
        }
        int[] arr = new int[cost.length];

        arr[0] = cost[0];
        arr[1] = Math.min(arr[0] + cost[1],cost[1]);
        for(int i = 2; i < cost.length ; i++){
            arr[i] = cost[i] + Math.min(arr[i-1], arr[i-2]);
        }

        return Math.min(arr[n-1],arr[n-2]);
    }
}
