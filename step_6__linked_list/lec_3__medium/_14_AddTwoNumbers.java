package step_6__linked_list.lec_3__medium;

public class _14_AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rs = new ListNode(-1), rsTemp = rs;
        int carry = 0;

        while (l1 != null || l2 != null || carry == 1) {
            int result = carry;
            if (l1 != null) {
                result += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                result += l2.val;
                l2 = l2.next;
            }

            ListNode newNode = new ListNode(result % 10);
            rsTemp.next = newNode;
            rsTemp = newNode;
            carry = result / 10;
        }

        return rs.next;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.createList(new int[]{2, 4, 3}); // represents 342
        ListNode l2 = ListNode.createList(new int[]{5, 6, 4}); // represents 465

        System.out.print("Input List 1: ");
        ListNode.printList(l1);

        System.out.print("Input List 2: ");
        ListNode.printList(l2);

        ListNode result = addTwoNumbers(l1, l2); // should represent 807

        System.out.print("Result (Sum): ");
        ListNode.printList(result);
    }
}
