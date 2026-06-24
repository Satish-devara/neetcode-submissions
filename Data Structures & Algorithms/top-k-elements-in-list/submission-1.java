class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
            List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> mpp.get(a) - mpp.get(b)
        );

        for(int key : mpp.keySet()){
            pq.add(key);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] result = new int[k];
        int idx = 0;
        for(int i = 0; i < k; i++){
            result[idx++] = pq.poll();
        }
        
        return result;
    }
}
