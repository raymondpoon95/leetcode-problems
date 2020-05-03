/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
// recursive solution
    private final int[] max = new int[1];
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        max[0] = Integer.MIN_VALUE;
        helper(root);
        return max[0];
    }
    
    private int helper(TreeNode root){
        if(root == null) 
            return 0;
        
        int left = helper(root.left);
        int right = helper(root.right);
        
        max[0] = Math.max(max[0], left + right);
        
        return Math.max(left, right) + 1;
    }
// iterative solution
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null) return 0;
        
//         Map<TreeNode, Integer> map = new HashMap<>();
//         Stack<TreeNode> stack = new Stack<>();
//         int ans = 0;
        
//         stack.push(root);
        
//         while(!stack.isEmpty()){
//             TreeNode node = stack.peek();
            
//             if(node.left != null && !map.containsKey(node.left))
//                 stack.push(node.left);
//             else if(node.right != null && !map.containsKey(node.right))
//                 stack.push(node.right);
//             else{
//                 stack.pop();
//                 int left = map.getOrDefault(node.left, 0);
//                 int right = map.getOrDefault(node.right, 0);
//                 map.put(node, Math.max(left, right) + 1);
//                 ans = Math.max(ans, left + right);
//             }
//         }
//         return ans;
//     }
}

// space and time complexity is both O(N)
