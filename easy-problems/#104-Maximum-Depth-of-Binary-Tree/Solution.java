/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
    // recursion solution
//        if(root == null){
//            return 0;
//        }
        
//         int left = maxDepth(root.left);
//         int right = maxDepth(root.right);
        
//         return Math.max(left, right)+1;

        
        // iterative solution
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> depthCount = new Stack<>();
        
        stack.push(root);
        depthCount.push(1);
        
        int max = 1;
        
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            int count = depthCount.pop();
            
            if(node.left == null && node.right == null){
                max = Math.max(max, count);
            }
            
            if(node.left != null){
                stack.push(node.left);
                depthCount.push(count + 1);
            }
            
            if(node.right != null){
                stack.push(node.right);
                depthCount.push(count + 1);
            }
        }
        return max;
    }
}

// time and space complexity of both solutions is O(N)
