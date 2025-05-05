package step_6__linked_list.lec_3__medium;

public class _4_HasCycleChecker {

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Example 1: No cycle
        int[] values = {3, 2, 0, -4};
        ListNode head = ListNode.createList(values);
        System.out.println("Has Cycle (no cycle case)? " + hasCycle(head));

        // Example 2: Create a cycle manually: connect last node to node at index 1
        ListNode withCycle = ListNode.createList(values);
        ListNode tail = withCycle;
        ListNode cyclePoint = withCycle.next; // node with value 2
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = cyclePoint; // creates the cycle

        System.out.println("Has Cycle (with cycle case)? " + hasCycle(withCycle));
    }
}
