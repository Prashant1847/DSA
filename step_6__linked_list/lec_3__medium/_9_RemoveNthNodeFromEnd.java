package step_6__linked_list.lec_3__medium;

public class _9_RemoveNthNodeFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode windowEnd = head, windowStart = head;

        while (n > 0) {
            windowEnd = windowEnd.next;
            n--;
        }

        if (windowEnd == null) {
            head = head.next;
            return head;
        }

        while (windowEnd.next != null) {
            windowEnd = windowEnd.next;
            windowStart = windowStart.next;
        }

        windowStart.next = windowStart.next.next;
        return head;
    }

    public static void main(String[] args) {
        // Example: Input list = [1, 2, 3, 4, 5], remove 2nd node from end => [1, 2, 3, 5]
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = ListNode.createList(values);

        int n = 2;
        ListNode updatedHead = removeNthFromEnd(head, n);

        System.out.print("Updated List after removing " + n + "th node from end: ");
        ListNode.printList(updatedHead);
    }
}
