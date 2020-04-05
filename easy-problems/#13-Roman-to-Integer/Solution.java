class Solution {
    public int romanToInt(String s) {
        if(s.length() == 0){
            return 0;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        char prev = '#';
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        for(int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            int valueOfCurrentChar = map.get(c);
            
            if(valueOfCurrentChar < result && c != prev){
                result -= valueOfCurrentChar;
            } else {
                result += valueOfCurrentChar;
            }
            prev = c;
        }
        return result;
    }
}

// O(n) time complexity and O(n) space complexity
