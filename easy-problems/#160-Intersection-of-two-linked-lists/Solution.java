/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode result = new ListNode(0);
//         ListNode result1 = result;
//         Set<ListNode> setList = new HashSet<ListNode>();
        
//         if(headA == null || headB == null){
//             return null;
//         }
        
//         while(headA != null){
//             setList.add(headA);
//             headA = headA.next;
//         }
        
//         while(headB != null){
//             if(setList.contains(headB)){
//                 result1.next = headB;
//                 break;
//             }
//             headB = headB.next;
//         }
    
//         return result.next;
        
        if(headA == null || headB == null){
            return null;
        }
        
        ListNode a = headA;
        ListNode b = headB;
        
        while(a != b){
            if(a == null){
                a = headB;
            } else {
                a = a.next;
            }
            
            if(b == null){
                b = headA;
            } else {
                b = b.next;
            }
        }
        return a;
    }
}

//Both solutions have a time complexity of O(m + n) as you have to traverse both lists. However solution using hashSet 
requires a space complexity of O(n), whereas the other method only requires a space complexity of O(1) 
because it is using two pointers.
