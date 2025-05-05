package step_6__linked_list.lec_5_hard_problems_on_ll;

public class _1_ReverseKGroupSolution {

    private static ListNode reverse(ListNode node, int k){
        ListNode prev = null, curr = node;

        for(int i = 0; i < k; i++){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode linker = new ListNode(-1);
        ListNode start, curr = head, groupHead, newHead = linker;

        while(curr != null){
            int count = 0;
            start = curr;

            while(curr != null && count < k){
                curr = curr.next;
                count++;
            }

            groupHead = count == k ? reverse(start, k) : start;

            linker.next = groupHead;
            linker = start;
        }

        return newHead.next;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6};
        int k = 3;

        ListNode head = ListNode.createList(values);
        System.out.print("Original List: ");
        ListNode.printList(head);

        ListNode result = reverseKGroup(head, k);

        System.out.print("List After Reversing in K-Groups: ");
        ListNode.printList(result);
    }
}
