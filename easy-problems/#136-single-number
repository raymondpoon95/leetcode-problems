class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 0){
            return -1;
        } if(nums.length == 1){
            return nums[0];
        }
            
        
        
//         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
//         for(int num : nums){
//             if(map.containsKey(num)){
//                 map.put(num, map.get(num)+1);
//             } else {
//                 map.put(num, 1);
//             }
//         }
        
//         return Collections.min(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
        
        Set<Integer> set = new HashSet<Integer>();
        int result = 0;
        
        for(int i: nums){
            if(set.contains(i)){
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        
        for(int i: set){
            result = i;
        }
        
        return result;
        
    }
}
