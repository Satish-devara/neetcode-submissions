class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length() || s.length() == 0 || t.length() == 0) return false;
        HashMap<Character, Integer> sMap = new HashMap<>();

        for(int i  = 0; i < s.length(); i++){
            char c = s.charAt(i);

            sMap.put(c, sMap.getOrDefault(c, 0)+1);
        }

        HashMap<Character, Integer> tMap = new HashMap<>();

        for(int i  = 0; i < t.length(); i++){
            char c = t.charAt(i);

            tMap.put(c, tMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> mpp : sMap.entrySet()){
            char c = mpp.getKey();
            int freq = mpp.getValue();

            if(freq != tMap.getOrDefault(c, 0)) return false;
        }


        return true;


    }
}
