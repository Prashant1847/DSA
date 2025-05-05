package step_6__linked_list.lec_3__medium;

public class _12_IntersectionFinder {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }

    public static void main(String[] args) {
        // Shared nodes
        ListNode common = new ListNode(8, new ListNode(10));

        // List A: 3 -> 7 -> 8 -> 10
        ListNode headA = new ListNode(3, new ListNode(7, common));

        // List B: 99 -> 1 -> 8 -> 10
        ListNode headB = new ListNode(99, new ListNode(1, common));

        System.out.print("List A: ");
        ListNode.printList(headA);
        System.out.print("List B: ");
        ListNode.printList(headB);

        ListNode intersection = getIntersectionNode(headA, headB);
        if (intersection != null)
            System.out.println("Intersection at node with value: " + intersection.val);
        else
            System.out.println("No intersection found.");
    }
}
