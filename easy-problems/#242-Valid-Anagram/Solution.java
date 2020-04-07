class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        
        Arrays.sort(charS);
        Arrays.sort(charT);
        
        for(int i = 0; i < charS.length; i++){
            if(charS[i] != charT[i]){
                return false;
            }
        }
        return true;
    }
}

// Time complexity is O(n log n), due to the sorting of the 2 arrays which takes nlogn time + the for loop for comparison
// is O(n), but the sorting time dominates.

// Space complexity is O(1). 
// *****(Explanation from leetcode) 
// Space depends on the sorting implementation which, usually, costs O(1) auxiliary space if heapsort is used. 
// Note that in Java, toCharArray() makes a copy of the string so it costs O(n) extra space, 
// but we ignore this for complexity analysis because:

// It is a language dependent detail.
// It depends on how the function is designed. For example, the function parameter types can be changed to char[].*****
