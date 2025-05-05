package step_6__linked_list.lec_4_medium_problems_on_dll;

import java.util.ArrayList;

public class _2_FindPairsWithGivenSum {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, ListNode head) {
        ListNode tail = head;
        while (tail.next != null) tail = tail.next;

        ArrayList<ArrayList<Integer>> resultPairs = new ArrayList<>();
        while (head != null && tail != null && head.data < tail.data) {
            int sum = head.data + tail.data;

            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(head.data);
                pair.add(tail.data);
                resultPairs.add(pair);
                head = head.next;
                tail = tail.prev;
            } else if (sum < target) {
                head = head.next;
            } else {
                tail = tail.prev;
            }
        }

        return resultPairs;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 4, 5, 6, 8, 9};
        int target = 7;

        ListNode head = ListNode.createList(values);
        System.out.print("Doubly Linked List: ");
        ListNode.printList(head);

        ArrayList<ArrayList<Integer>> pairs = findPairsWithGivenSum(target, head);

        System.out.println("Pairs with sum " + target + ":");
        for (ArrayList<Integer> pair : pairs) {
            System.out.println(pair.get(0) + " + " + pair.get(1));
        }
    }
}