class Solution {
    public int numJewelsInStones(String J, String S) {
        if(J.length() == 0 || S.length() == 0) return 0;
        
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        
        for(char c : J.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(int i = 0; i < S.length(); i++){
            if(map.containsKey(S.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
// time complexity O(J+S), space complexity O(J) size of J
