package Abluyon_Kimpay.M2_AddTwoNumbers;

/**
 * Solves LeetCode problem 2: Add Two Numbers.
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a
 * single digit. Add the two numbers and return the sum as a linked list.
 *
 * @see <a href="https://leetcode.com/problems/add-two-numbers/">LeetCode Problem 2</a>
 */
public class AddTwoNumbers {

    /**
     * Definition for singly-linked list.
     * This static inner class represents a single node in the linked list.
     */
    public static class ListNode {
        public int val;
        public ListNode next;

        /**
         * Default constructor.
         */
        public ListNode() {}

        /**
         * Constructor with a value.
         * @param val The value to store in this node.
         */
        public ListNode(int val) { this.val = val; }

        /**
         * Constructor with a value and a reference to the next node.
         * @param val The value to store in this node.
         * @param next The next node in the list.
         */
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /**
     * Adds two numbers represented by linked lists.
     * <p>
     * The digits are in reverse order. This method iterates through both lists
     * simultaneously, adding digits along with a 'carry' value, and builds
     * a new result list.
     *
     * @param l1 The first linked list (representing a number).
     * @param l2 The second linked list (representing a number).
     * @return A new linked list representing the sum.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // A dummy head makes the list-building logic simpler.
        // The actual result list starts at dummyHead.next.
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Loop continues as long as there are digits in either list
        // or there is a remaining carry.
        while (l1 != null || l2 != null || carry != 0) {
            // Get the value from the node, or 0 if the list is finished.
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10; // The new carry is the quotient (e.g., 15 / 10 = 1)

            // Create a new node with the remainder (e.g., 15 % 10 = 5)
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes if they exist.
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Return the start of the new list, skipping the dummy head.
        return dummyHead.next;
    }
}