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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null)
        return head;

        ListNode cur=head;
        while(cur!=null && cur.next!=null)
        {
            int a =cur.val;
            int b=cur.next.val;
            int c=gcd(a,b);
            ListNode node =new ListNode(c);
            ListNode t=cur.next;
            cur.next=node;
            node.next=t;
            cur=t;
        }
        return head;
        
    }
    public int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
}