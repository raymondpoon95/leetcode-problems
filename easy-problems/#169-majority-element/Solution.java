import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
//         for(int i : nums){
//             if(map.containsKey(i)){
//                 map.put(i, map.get(i) + 1);
//             } else {
//                 map.put(i, 1); 
//             }
//         }
        
//         Map.Entry<Integer, Integer> maxEntry = null;

//         for (Map.Entry<Integer, Integer> entry : map.entrySet()){
//             if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
//                 maxEntry = entry;
//             }
//         }
//         return maxEntry.getKey();
        

// return number in the middle because the majority element will always have to be MORE THAN half the length of the array
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}