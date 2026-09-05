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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode head, mergedItr;
        ListNode itr1 = list1;
        ListNode itr2 = list2;
        if (list1.val > list2.val) {
            head = list2;
            itr2 = itr2.next;
            mergedItr = head;
        } else {
            head = list1;
            itr1 = itr1.next;
            mergedItr = head;
        }

        while (itr1 != null && itr2 != null) {
            if (itr1.val > itr2.val) {
                mergedItr.next = itr2;
                mergedItr = itr2;
                itr2 = itr2.next;
            } else {
                mergedItr.next = itr1;
                mergedItr = itr1;
                itr1 = itr1.next;
            }
        }

        while (itr1 != null) {
            mergedItr.next = itr1;
            mergedItr = itr1;
            itr1 = itr1.next;
        }

        while (itr2 != null) {
            mergedItr.next = itr2;
            mergedItr = itr2;
            itr2 = itr2.next;
        }
        return head;
    }
}