package step_6__linked_list.lec_5_hard_problems_on_ll;

public class _2_RotateList {

    private static ListNode reverse_N_Nodes(ListNode head, int n){
        ListNode current = head;
        ListNode previous = null;

        for(int i = 0; i < n; i++){
            ListNode nxt = current.next;
            current.next = previous;
            previous = current;
            current = nxt;
        }

        return previous;
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        int length = 0;

        while(temp != null) {
            length++;
            temp = temp.next;
        }

        int toRotateBy = k % length;
        int firstHalfLength = length - toRotateBy;

        if(toRotateBy == 0) return head;

        temp = head;
        int count = firstHalfLength;
        while(count > 0){
            temp = temp.next;
            count--;
        }

        ListNode firstHalfHead = reverse_N_Nodes(head, firstHalfLength);
        temp = reverse_N_Nodes(temp, toRotateBy);
        head.next = temp;

        head = reverse_N_Nodes(firstHalfHead, length);
        return head;
    }

    // MAIN METHOD TO TEST
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        ListNode head = ListNode.createList(arr);
        System.out.print("Original List: ");
        ListNode.printList(head);

        ListNode rotated = rotateRight(head, k);
        System.out.print("Rotated List by " + k + ": ");
        ListNode.printList(rotated);
    }
}

