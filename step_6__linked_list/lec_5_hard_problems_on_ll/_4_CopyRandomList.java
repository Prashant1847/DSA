package step_6__linked_list.lec_5_hard_problems_on_ll;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode random;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    // Create a deep linked list with only values (random will be set separately)
    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;

        List<ListNode> nodeList = new ArrayList<>();
        for (int val : values) {
            nodeList.add(new ListNode(val));
        }

        for (int i = 0; i < nodeList.size() - 1; i++) {
            nodeList.get(i).next = nodeList.get(i + 1);
        }

        return nodeList.get(0);
    }

    // Print the list with random pointer values
    public static void printList(ListNode head) {
        while (head != null) {
            int randomVal = head.random != null ? head.random.val : -1;
            System.out.print("[" + head.val + ", rand: " + randomVal + "] -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}


public class _4_CopyRandomList {

    public static ListNode copyRandomList(ListNode head) {
        if (head == null) return null;

        ListNode temp = head;

        // Step 1: Insert clone nodes after originals
        while (temp != null) {
            ListNode cloned = new ListNode(temp.val);
            cloned.next = temp.next;
            temp.next = cloned;
            temp = cloned.next;
        }

        // Step 2: Assign random pointers to cloned nodes
        temp = head;
        while (temp != null) {
            temp.next.random = temp.random != null ? temp.random.next : null;
            temp = temp.next.next;
        }

        // Step 3: Detach the cloned list
        ListNode cloneHead = head.next;
        temp = head;
        while (temp != null) {
            ListNode clone = temp.next;
            temp.next = clone.next;
            clone.next = (clone.next != null) ? clone.next.next : null;
            temp = temp.next;
        }

        return cloneHead;
    }

    public static void main(String[] args) {
        int[] values = {7, 13, 11, 10, 1};
        List<ListNode> nodes = new ArrayList<>();

        for (int val : values) {
            nodes.add(new ListNode(val));
        }

        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).next = nodes.get(i + 1);
        }

        // Sample random setup (same as popular test case)
        nodes.get(1).random = nodes.get(0);
        nodes.get(2).random = nodes.get(4);
        nodes.get(3).random = nodes.get(2);
        nodes.get(4).random = nodes.get(0);

        ListNode head = nodes.get(0);

        System.out.println("Original List:");
        ListNode.printList(head);

        ListNode copied = copyRandomList(head);
        System.out.println("Cloned List:");
        ListNode.printList(copied);
    }
}
