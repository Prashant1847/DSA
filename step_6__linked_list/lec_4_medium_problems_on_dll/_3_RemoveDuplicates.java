package step_6__linked_list.lec_4_medium_problems_on_dll;

public class _3_RemoveDuplicates {
    static ListNode removeDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode temp = head.next;

        while (temp != null) {
            if (temp.data == temp.prev.data) {
                temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
            }
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        // Sorted doubly linked list with duplicates
        int[] values = {1, 2, 2, 3, 4, 4, 4, 5};

        ListNode head = ListNode.createList(values);
        System.out.print("Original List: ");
        ListNode.printList(head);

        // Call removeDuplicates
        ListNode updatedHead = removeDuplicates(head);

        System.out.print("After Removing Duplicates: ");
        ListNode.printList(updatedHead);
    }
}