package com.algo.algo.leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedList_206Test {
    @Test
    public void testReverseList() {
        ReverseLinkedList_206 solution = new ReverseLinkedList_206();
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = solution.createList(arr);
        System.out.print("Original List: ");
        solution.printList(head);

        ListNode reversedHead = solution.reverseList(head);
        System.out.print("Reversed List: ");
        solution.printList(reversedHead);
    }
}