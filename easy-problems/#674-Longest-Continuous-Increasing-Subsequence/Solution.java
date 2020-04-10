class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        
        if(nums.length == 0){
            return 0;
        }
            
        int count = 1, max = 0;
        
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}

// time complexity O(n), space complexity O(1)
