/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        Deque<ListNode> stack = new ArrayDeque<>();

        // go thru linkedlist
        ListNode current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }
        current = head = stack.pop();
        
        while (current != null) {
            current.next = stack.peek();
            if (current.next == null) {
                break;
            }
            current = stack.pop();
        }
        return head;
    }
}
