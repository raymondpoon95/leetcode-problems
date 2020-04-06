class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        int i = 0;
        int j = 0;
        int answer = 0;
        
        while(i < s.length() && j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                answer = Math.max(answer, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return answer;
    }
    
}
