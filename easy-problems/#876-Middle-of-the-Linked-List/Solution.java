/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return head;
        }
        
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        
        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }
}

//Time complexity is O(n) as you traverse the linkedlist in linear time. Space complexity is O(1) as you do not use
// additional memory and using two pointers.
