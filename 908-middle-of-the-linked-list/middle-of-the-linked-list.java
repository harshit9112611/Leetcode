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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        ListNode node=head;
        ListNode flag=null;
        int count=0;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        int middle=count/2+1;
        int count1=0;
        while(node!=null) {
            count1++;
            if(count1==middle) {
                flag=node;
                break;
            }
            node=node.next;
        }
        return flag;
    }
}