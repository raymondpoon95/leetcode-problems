class Solution {
    public int maxArea(int[] height) {
        if(height.length == 0){
            return 0;
        }
        
        int max = 0;
        int left = 0, right = height.length-1;
        
        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);
            
            if(max < area)
                max = area;
            
            if(height[left] < height[right])
                left++;
            else 
                right--;
        }

// Time complexity of brute force solution is O(N^2) and space complexity is O(1) 
//         for(int i = 0; i < height.length-1; i++){
//             int min = 0, area = 0;
            
//             for(int k = i; k < height.length; k++){
//                 max = Math.max(max, (Math.min(height[i], height[k]) * Math.abs(k-i)));
//             }
//         }
        return max;
}

// Time complexity of two pointer approach is O(N) and space complexity of O(1)
