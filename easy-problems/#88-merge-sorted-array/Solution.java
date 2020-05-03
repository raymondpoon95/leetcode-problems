import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // sort solution takes O(log n) time and O(1) space complexity
        // int j = 0;
        
        // for(int i = nums1.length-1; i >= m; i--){
        //     nums1[i] = nums2[j];
        //     j++;
        // }
        
        // Arrays.sort(nums1);
        
        int i = m - 1, j = n - 1, length = m + n - 1;
        
        while(i >= 0 && j >= 0){
            if(nums2[j] > nums1[i])
                nums1[length--] = nums2[j--];
            else 
                nums1[length--] = nums1[i--];
        }
        
        while(j >= 0)
            nums1[length--] = nums2[j--];
    }
}
// the second solution takes O(N) time complexity and O(1) space 
