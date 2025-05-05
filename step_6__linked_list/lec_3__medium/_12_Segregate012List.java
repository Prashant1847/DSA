package step_6__linked_list.lec_3__medium;

public class _12_Segregate012List {

    public static ListNode segregate(ListNode head) {
        ListNode list0s = new ListNode(-1), list1s = new ListNode(-1), list2s = new ListNode(-1);
        ListNode first0s = list0s, first1s = list1s, first2s = list2s;

        if (head == null || head.next == null) return head;

        ListNode temp = head;
        while (temp != null) {
            if (temp.val == 0) {
                list0s.next = temp;
                list0s = temp;
            } else if (temp.val == 1) {
                list1s.next = temp;
                list1s = temp;
            } else {
                list2s.next = temp;
                list2s = temp;
            }
            temp = temp.next;
        }

        list0s.next = (first1s.next != null) ? first1s.next : first2s.next;
        list1s.next = first2s.next;
        list2s.next = null;

        return first0s.next;
    }

    public static void main(String[] args) {
        int[] values = {1, 0, 2, 1, 0, 2, 1, 0}; // Sample input

        ListNode head = ListNode.createList(values);

        System.out.print("Original List: ");
        ListNode.printList(head);

        head = segregate(head);

        System.out.print("Sorted List: ");
        ListNode.printList(head);
    }
}
