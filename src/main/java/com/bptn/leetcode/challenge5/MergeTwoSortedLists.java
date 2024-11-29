package com.bptn.leetcode.challenge5;

public class MergeTwoSortedLists {
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify handling the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy; 

        while (list1 != null && list2 != null) {
            // Compare the values of the nodes from both lists
            if (list1.val <= list2.val) {
                current.next = list1;  // Attach list1 node to the merged list
                list1 = list1.next;    // Move list1 pointer to the next node
            } else {
                current.next = list2;  // Attach list2 node to the merged list
                list2 = list2.next;    // Move list2 pointer to the next node
            }
            current = current.next;  // Move 'current' to the next node in the merged list
        }

        // If one of the lists is not yet empty, append it to the merged list
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list, which starts after the dummy node
        return dummy.next;
    }

}
