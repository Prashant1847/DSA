package step_6__linked_list.lec_3__medium;

public class _7_PalindromeLinkedListChecker {

    private static ListNode returnMedian(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

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

    public static boolean isPalindrome(ListNode head) {
        ListNode middle = returnMedian(head);
        ListNode newHead = reverse(middle);
        ListNode temp = newHead, first = head;

        while (temp != null) {
            if (temp.val != first.val) {
                reverse(newHead);
                return false;
            }
            temp = temp.next;
            first = first.next;
        }

        reverse(newHead);
        return true;
    }

    public static void main(String[] args) {
        // Test 1: Palindrome list
        int[] values1 = {1, 2, 3, 2, 1};
        ListNode head1 = ListNode.createList(values1);
        System.out.println("Is palindrome? " + isPalindrome(head1)); // true

        // Test 2: Not a palindrome
        int[] values2 = {1, 2, 3, 4};
        ListNode head2 = ListNode.createList(values2);
        System.out.println("Is palindrome? " + isPalindrome(head2)); // false
    }
}
