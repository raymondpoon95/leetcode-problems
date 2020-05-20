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
    private List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        helper(root);
        return list.get(k-1);
    }
    
    private void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
}
// time complexity is O(h) where h = height. Space complexity is O(n) where n = number of elements in the BST
