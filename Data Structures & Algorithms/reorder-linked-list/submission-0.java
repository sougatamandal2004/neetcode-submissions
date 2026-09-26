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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode fastHead = head;
        ListNode lastHead = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode temp = lastHead;
        while(temp != null){
            ListNode nxt = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nxt;
        }
        lastHead = prev;
        while(fastHead != null && lastHead != null) {
            ListNode temp1 = fastHead.next;
            fastHead.next = lastHead;
            ListNode temp2 = lastHead.next;
            lastHead.next = temp1;
            fastHead = temp1;
            lastHead = temp2;
        }
    }
}
