package step_6__linked_list.lec_3__medium;

public class _5_CycleStartFinder {

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) break;
        }

        if (fast == slow) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }

    public static void main(String[] args) {
        // Create list: 3 -> 2 -> 0 -> -4
        int[] values = {3, 2, 0, -4};
        ListNode head = ListNode.createList(values);

        // Introduce cycle: tail (-4) points to node with value 2 (index 1)
        ListNode cycleStart = head.next; // node with value 2
        ListNode tail = head;
        while (tail.next != null) tail = tail.next;
        tail.next = cycleStart;

        // Detect cycle
        ListNode result = detectCycle(head);
        if (result != null)
            System.out.println("Cycle starts at node with value: " + result.val);
        else
            System.out.println("No cycle detected.");
    }
}

