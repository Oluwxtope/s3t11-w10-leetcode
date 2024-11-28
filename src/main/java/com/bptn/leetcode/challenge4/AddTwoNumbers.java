package com.bptn.leetcode.challenge4;

public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(); // Create new ListNode object to track result
        ListNode headRes = res; // Variable headRes will always point to the head of the result ListNode object
        while (true) { // Run loop until break reached in loop body
            int l1Value = l1 != null ? l1.val : 0; // If l1 ListNode isn't null, save l1 val else set variable to 0
            int l2Value = l2 != null ? l2.val : 0; // If l2 ListNode isn't null, save l2 val else set variable to 0
            int sum = l1Value + l2Value + res.val; // Sum l1Value, l2Value and current res ListNode val
            boolean overflow = sum >= 10; // Check if there is overflow i.e. sum is more than 1 digit
            res.val = overflow ? sum - 10 : sum; // If overflow present, save last digit of sum to res val else save entire sum
            res.next = overflow ? new ListNode(1) : new ListNode(); // Set next ListNode in res val to 1 if overflow else 0
            l1 = l1 != null ? l1.next : null; // If l1 isn't null, move to next ListNode in l1
            l2 = l2 != null ? l2.next : null; // If l2 isn't null, move to next ListNode in l2
            if (l1 == null && l2 == null) { // If both l1 and l2 null, break
                if (res.next.val == 0) { // next val of res needs to be null if it's 0 to get rid of leading 0's
                    res.next = null;
                }
                break;
            } else { // If both l1 and l2 not null, set res to the next ListNode in res
                res = res.next;
            }
        }
        return headRes;
    }
}
