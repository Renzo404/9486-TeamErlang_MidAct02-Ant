package linkedlist.M2_AddTwoNumbers;
/**
 * Solves LeetCode problem 2: Add Two Numbers.
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a
 * single digit. Add the two numbers and return the sum as a linked list.
 *
 * @see <a href="https://leetcode.com/problems/add-two-numbers/">LeetCode Problem 2</a>
 *
 * @author Dela Cruz, Angelika
 * @author Mabalot, Rod Clarenz
 */
public class AddTwoNumbers {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    /**
     * Adds two numbers represented by non-empty linked lists. The digits are stored
     * in reverse order, and each of their nodes contains a single digit.
     * * The method uses a single pass with a carry variable to sum the lists.
     *
     * @param l1 The head of the first linked list (number 1).
     * @param l2 The head of the second linked list (number 2).
     * @return The head of the resulting linked list, representing the sum of the two numbers.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            current.next = new ListNode(digit);
            current = current.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return temp.next;
    }

    // --- Helper Methods for Testing ---
    /** Truncates a string for clean table display, adding "..." if necessary. */
    private static String truncateString(String s, int maxLength) {
        if (s.length() > maxLength) {
            return s.substring(0, maxLength - 3) + "...";
        }
        return s;
    }

    /** Creates a linked list from an integer array. */
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    /** Converts a linked list to a string representation. */
    public static String listToString(ListNode head) {
        if (head == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        ListNode current = head;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    /** Compares two linked lists for equality. */
    private static boolean compareLists(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }
}
