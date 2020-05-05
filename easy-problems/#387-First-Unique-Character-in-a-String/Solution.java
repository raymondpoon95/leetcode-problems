class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 0 || s == null) return -1;
  
        int[] map = new int[26];
        
        for(int i = 0; i < s.length(); i++)
            map[s.charAt(i)-'a']++;
        
        for(int i = 0; i < s.length(); i++){
            if(map[s.charAt(i)-'a'] == 1)
                return i;
        }
        return -1;
        
//         Map<Character, Integer> map = new HashMap<>();
        
//         for(char c : s.toCharArray()){
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }
        
//         for(int i = 0; i < s.length(); i++){
//             if(map.get(s.charAt(i)) == 1)
//                 return i;
//         }
//         return -1;
    }
}
// 2 similar ways of solving the solution both using the styles of a map. One way is to use an array with size 26, the other
// is to use java map function. Both has time and space complexity O(n)
