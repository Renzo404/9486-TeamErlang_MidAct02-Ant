package array.E27_RemoveElement;
/**
 * <h1>Remove Element</h1>
 * The {@code RemoveElement} class provides a method to remove all instances
 * of a specified value from an integer array in-place and return the new length.
 * <p>
 * The order of the elements may be changed, and elements beyond the new length
 * do not matter. This solution is based on LeetCode problem #27: "Remove Element".
 * </p>
 *
 * <p><b>Example:</b></p>
 * <pre>
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * </pre>
 *
 * <p><b>Constraints:</b></p>
 * <ul>
 *   <li>0 ≤ nums.length ≤ 100</li>
 *   <li>0 ≤ nums[i] ≤ 50</li>
 *   <li>0 ≤ val ≤ 100</li>
 * </ul>
 *
 * @author Aquino
 * @version 1.0
 */
public class RemoveElement {

     /**
     * Removes all occurrences of {@code val} from the {@code nums} array in-place.
     * Returns the new length after removal.
     *
     * @param nums the array of integers
     * @param val the value to remove
     * @return the new length of the modified array
     */
    
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveElement solver = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(solver.removeElement(nums, val)); // 2
    }
}
