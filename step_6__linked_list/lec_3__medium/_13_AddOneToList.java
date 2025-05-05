package step_6__linked_list.lec_3__medium;

public class _13_AddOneToList {

    private static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            ListNode nxt = current.next;
            current.next = previous;
            previous = current;
            current = nxt;
        }

        return previous;
    }

    public static ListNode addOne(ListNode head) {
        head = reverse(head);
        ListNode temp = head;

        while (temp != null) {
            if ((temp.val + 1) <= 9) {
                temp.val = temp.val + 1;
                break;
            } else {
                temp.val = 0;
                if (temp.next == null) {
                    temp.next = new ListNode(0);
                }
            }
            temp = temp.next;
        }

        head = reverse(head);
        return head;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.createList(new int[]{9, 9, 9});
        System.out.print("Original List: ");
        ListNode.printList(head);

        ListNode updated = addOne(head);
        System.out.print("After Adding One: ");
        ListNode.printList(updated);
    }
}

