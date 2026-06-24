class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
            List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];


        for(Map.Entry<Integer, Integer> map : mpp.entrySet()){
           int freq = map.getValue();

           if(bucket[freq] == null){
            bucket[freq] = new ArrayList<>();
           }

           bucket[freq].add(map.getKey());
        }


        int[] result = new int[k];
        int index = 0;
        for(int i = bucket.length -1; i >= 0 && index < k; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    result[index++] = num;
                    if(index == k) return result;
                }
            }
        }
        
        return result;
    }
}
