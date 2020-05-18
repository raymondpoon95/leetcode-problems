class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() == 0) return false;
        
        int[] map = new int[26];
        for(char c : s1.toCharArray())
            map[c-'a']++;
        
        int start = 0, end = 0, count = s1.length();
        
        while(end < s2.length()){
            if(map[s2.charAt(end++)-'a']-- >= 1)
                count--;
            if(count == 0)
                return true;
            if(end-start == s1.length() && map[s2.charAt(start++)-'a']++ >= 0)
                    count++;
        }
        return false;
    }
}
