package step_6__linked_list.lec_4_medium_problems_on_dll;

public class ListNode {
    int data;
    ListNode next;
    ListNode prev;

    ListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    // Utility to create a doubly linked list from an array
    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode curr = head;

        for (int i = 1; i < values.length; i++) {
            ListNode newNode = new ListNode(values[i]);
            curr.next = newNode;
            newNode.prev = curr;
            curr = newNode;
        }

        return head;
    }

    // Utility to print the doubly linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" <-> ");
            curr = curr.next;
        }
        System.out.println();
    }
}
