class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) {
            return new ArrayList<>();
        }
    
        Map<String, List> map = new HashMap<>();
        
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            
            String key = String.valueOf(c);
            
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}

// Outer loop runs for N times. The sorting in the loop runs for (n log n) times. Therefore time complexity can be written as
// O(n * k log k), re-written without using nlogn for clarification. Space complexity is O(N*K) which is the content in map.
