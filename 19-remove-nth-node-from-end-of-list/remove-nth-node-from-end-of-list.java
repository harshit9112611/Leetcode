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
        ListNode temp=head;
        int size=0;
        while(temp!=null) {
            size++;
            temp=temp.next;
        }
        if(n==size) {
            head=head.next;
            return head;
        }
    ListNode node=head;
    if(n==0) {
        while(node.next.next!=null) {
            node=node.next;
        }
        node.next=null;
        return head;
    }
    int count=1;
    while(node!=null && node.next!=null) {
        ListNode extra=null;
        if(count==size-n) {
            extra=node.next;
            node.next=node.next.next;
            extra.next=null;
            break;
        }
        node=node.next;
        count++;
    }
    return head;
    }
}