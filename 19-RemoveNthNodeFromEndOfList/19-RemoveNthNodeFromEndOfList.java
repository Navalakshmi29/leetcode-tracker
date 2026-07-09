// Last updated: 08/07/2026, 21:53:17
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l=head;
        ListNode r=head;
        for(int i=0;i<n;i++){
            l=l.next;
        }
        if(l==null){
            return head.next;
        }
        while(l.next!=null){
            l=l.next;
            r=r.next;
        }
        r.next=r.next.next;
        return head;
    }
}