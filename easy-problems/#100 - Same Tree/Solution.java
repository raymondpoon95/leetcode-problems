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
    public boolean isSameTree(TreeNode p, TreeNode q) {
//      recurive solution to the problem
        if(p == null && q == null){
            return true;
        } else if(p == null || q == null){
            return false;
        }
//         if(p.val != q.val){
//             return false;
//         }
        
//         return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        
// iterative solution 

        Stack<TreeNode> p_stack = new Stack<>();
        Stack<TreeNode> q_stack = new Stack<>();
        
        p_stack.push(p);
        q_stack.push(q);
        
        while(!p_stack.isEmpty() && !q_stack.isEmpty()){
            TreeNode p_node = p_stack.pop();
            TreeNode q_node = q_stack.pop();
            
            if(p_node == null && q_node == null){
                continue;
            } else if(p_node == null || q_node == null || p_node.val != q_node.val){
                return false;
            }
            
            p_stack.push(p_node.left);
            q_stack.push(q_node.left);
            p_stack.push(p_node.right);
            q_stack.push(q_node.right);
        }
        return p_stack.isEmpty() == q_stack.isEmpty();
    }
}

// Time complexity of both solutions is O(N) as you have to traverse and compare elements in both trees, space complexity
// is O(N)
