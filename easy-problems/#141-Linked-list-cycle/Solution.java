/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        
        // Time complexity of using a hashset to store value is O(n) as you have to touch every element and space complexity is also O(n) which also depends on n elements of the ListNode.
        
//         if(head == null ){
//             return false;
//         }
        
//         Set<ListNode> set = new HashSet<ListNode>();
    
//         while(head != null){
//             if(!set.contains(head)){
//                 set.add(head);
//             } else {
//                 return true;
//             }
//             head = head.next;
//         }
//         return false;
        
        // Time complexity for both algorithms are O(n) but the one below uses two pointers so the space complexity is only O(1).
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            } 
        }
        return false;
    }
}
