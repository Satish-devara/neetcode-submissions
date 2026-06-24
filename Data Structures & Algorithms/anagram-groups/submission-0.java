class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 1){
            return List.of(List.of(strs[0]));
        } 

        Map<String, List<String>> mpp = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
           

            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }

        StringBuilder sb = new StringBuilder();

        for(int i : count){
            sb.append('#');
            sb.append(i);
        }

        String str = sb.toString();
        mpp.putIfAbsent(str, new ArrayList<>());

        mpp.get(str).add(s);

        }

        return new ArrayList<>(mpp.values());
    }
}

