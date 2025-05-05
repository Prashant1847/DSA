package step_6__linked_list.lec_3__medium;

public class _10_DeleteMiddleNode {

    public static ListNode deleteMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        if (head == null || head.next == null) return null;

        fast = head.next.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        // Input: [1, 2, 3, 4] -> Output: [1, 2, 4]
        int[] values = {1, 2, 3, 4};
        ListNode head = ListNode.createList(values);

        System.out.print("Original list: ");
        ListNode.printList(head);

        head = deleteMiddle(head);

        System.out.print("After deleting middle node: ");
        ListNode.printList(head);
    }
}
