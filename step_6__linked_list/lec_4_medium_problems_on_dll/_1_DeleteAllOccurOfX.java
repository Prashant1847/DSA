package step_6__linked_list.lec_4_medium_problems_on_dll;

public class _1_DeleteAllOccurOfX {
    public static ListNode deleteAllOccurOfX(ListNode head, int x) {
        ListNode curr = head;

        while (curr != null) {
            if (curr.data == x) {
                ListNode prev = curr.prev;
                ListNode next = curr.next;

                if (curr == head) {
                    head = next;
                }

                if (prev != null) prev.next = next;
                if (next != null) next.prev = prev;
            }

            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] values = {1, 3, 5, 3, 7, 3, 9}; // initial doubly linked list
        int x = 3; // value to delete

        ListNode head = ListNode.createList(values);

        System.out.print("Original List: ");
        ListNode.printList(head);

        head = deleteAllOccurOfX(head, x);

        System.out.print("After Deleting " + x + ": ");
        ListNode.printList(head);
    }
}
