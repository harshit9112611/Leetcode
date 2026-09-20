class Solution {
    public ListNode findKthNode(ListNode temp, int k) {
        k--;

        while (temp != null && k > 0) {
            temp = temp.next;
            k--;
        }

        return temp;
    }

    public ListNode reverseLL(ListNode head) {
        ListNode prevNode = null;
        ListNode nextNode = null;
        ListNode temp = head;

        while (temp != null) {
            nextNode = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = nextNode;
        }

        return prevNode;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode = null;

        while (temp != null) {
            ListNode kNode = findKthNode(temp, k);

            // Fewer than k nodes remain
            if (kNode == null)
                break;

            ListNode nextNode = kNode.next;

            // Disconnect current group
            kNode.next = null;

            // Reverse current group
            reverseLL(temp);

            // Connect reversed group
            if (temp == head)
                head = kNode;
            else
                prevNode.next = kNode;

            // Connect to the next group
            temp.next = nextNode;

            // Move to next group
            prevNode = temp;
            temp = nextNode;
        }

        return head;
    }
}