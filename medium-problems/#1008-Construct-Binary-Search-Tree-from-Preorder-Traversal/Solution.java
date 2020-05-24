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
    // private int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode node = new TreeNode(preorder[0]);
        for(int i = 1; i < preorder.length; i++){
            helper(node, preorder[i]);
        }
        return node;
        // return helper(preorder, Integer.MAX_VALUE);
    }
    
    // more intuitive way of solving the problem using for loop
    private TreeNode helper(TreeNode root, int value){
        if(root == null) 
            return new TreeNode(value);
        if(root.val > value)
            root.left = helper(root.left, value);
        if(root.val < value)
            root.right = helper(root.right, value);
        return root;
    }
    
    // Another method of solving the solution using recursion
    // private TreeNode helper(int[] preorder, int maxLimit){
    //     if(i == preorder.length || preorder[i] > maxLimit)
    //         return null;
    //     TreeNode root = new TreeNode(preorder[i++]);
    //     root.left = helper(preorder, root.val);
    //     root.right = helper(preorder, maxLimit);
    //     return root;
    // }
}

// Both methods have time complexity O(N) as you are visiting every node
