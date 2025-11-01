import DelaCruz_Mabalot.M2_AddTwoNumbers.AddTwoNumbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    private AddTwoNumbers.ListNode createList(int[] values) {
        AddTwoNumbers.ListNode dummy = new AddTwoNumbers.ListNode(0);
        AddTwoNumbers.ListNode current = dummy;
        for (int val : values) {
            current.next = new AddTwoNumbers.ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    private boolean compareLists(AddTwoNumbers.ListNode l1, AddTwoNumbers.ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }

    @Test
    void testAddTwoNumbers_basicCases() {
        AddTwoNumbers solver = new AddTwoNumbers();

        AddTwoNumbers.ListNode l1 = createList(new int[]{2, 4, 3});
        AddTwoNumbers.ListNode l2 = createList(new int[]{5, 6, 4});
        AddTwoNumbers.ListNode expected = createList(new int[]{7, 0, 8});

        assertTrue(compareLists(expected, solver.addTwoNumbers(l1, l2)));
    }

    @Test
    void testAddTwoNumbers_withCarryOver() {
        AddTwoNumbers solver = new AddTwoNumbers();

        AddTwoNumbers.ListNode l1 = createList(new int[]{9, 9, 9, 9, 9, 9, 9});
        AddTwoNumbers.ListNode l2 = createList(new int[]{9, 9, 9, 9});
        AddTwoNumbers.ListNode expected = createList(new int[]{8, 9, 9, 9, 0, 0, 0, 1});

        assertTrue(compareLists(expected, solver.addTwoNumbers(l1, l2)));
    }

    @Test
    void testAddTwoNumbers_zeroCase() {
        AddTwoNumbers solver = new AddTwoNumbers();

        AddTwoNumbers.ListNode l1 = createList(new int[]{0});
        AddTwoNumbers.ListNode l2 = createList(new int[]{0});
        AddTwoNumbers.ListNode expected = createList(new int[]{0});

        assertTrue(compareLists(expected, solver.addTwoNumbers(l1, l2)));
    }
}
