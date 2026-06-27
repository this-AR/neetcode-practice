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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        ListNode head = new ListNode(-1);
        head.next = lists[0];

        for (int x = 1; x < lists.length; x++) {
            ListNode cur = lists[x];
            while (cur != null) {
                ListNode next = cur.next;  
                ListNode b = head;
                while (b.next != null && b.next.val <= cur.val) {
                    b = b.next;
                }
                cur.next = b.next;
                b.next = cur;

                cur = next;
            }
        }

        return head.next;
    }
}