package step_6__linked_list.lec_3__medium;

public class _1_MiddleNodeFinder {

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};
        ListNode head = ListNode.createList(input);

        System.out.print("Original List: ");
        ListNode.printList(head);

        ListNode middle = middleNode(head);
        System.out.print("Middle Node and onward: ");
        ListNode.printList(middle);
    }
}
