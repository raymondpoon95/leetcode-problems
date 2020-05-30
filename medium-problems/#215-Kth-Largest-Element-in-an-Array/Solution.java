class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length == 0 || nums == null) return 0;
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
// time complexity is O(NlogN)
// space complexity O(1)
