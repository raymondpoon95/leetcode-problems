class Solution {
    public void moveZeroes(int[] nums) {
// brute force method to count add the non-zero elements and then calculate the difference to figure out how many 
// zeroes will need to be in the array and then fill array with them. Time complexity O(n), space complexity O(n)?

//         List<Integer> result = new ArrayList<Integer>();
    
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] != 0){
//                 result.add(nums[i]);
//             }
//         }
        
//         int count = Math.abs(result.size() - nums.length);
        
//         for(int i = 0; i < count; i++){
//             result.add(0);
//         }
        
//         for(int i = 0; i < result.size(); i++){
//             nums[i] = result.get(i);
//         }


// more efficient method because it uses constant space, time complexity still O(n). Uses two pointers, where one traverses 
// the array and the other checks for non-zero elements. 
        
        int lastZeroSeen = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[lastZeroSeen] = nums[i];
                lastZeroSeen++;
            }
        }
        
        for(; lastZeroSeen < nums.length; lastZeroSeen++){
            nums[lastZeroSeen] = 0;
        }
        
    }
}
