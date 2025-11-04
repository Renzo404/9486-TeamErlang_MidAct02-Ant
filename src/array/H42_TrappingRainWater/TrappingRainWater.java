package array.H42_TrappingRainWater;
/**
 * <h1>Trapping Rain Water</h1>
 * The {@code TrappingRainWater} class calculates how much water can be trapped
 * between bars after raining, given an array representing bar heights.
 * <p>
 * This is based on LeetCode problem #42: "Trapping Rain Water".
 * </p>
 *
 * <p><b>Example:</b></p>
 * <pre>
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * </pre>
 *
 * @author Aquino
 * @version 1.0
 */


public class TrappingRainWater {
        /**
        * Calculates the total amount of trapped rain water.
        *
        * @param height array representing the heights of the bars
        * @return total units of trapped rain water
        */

    // Testable method
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0, trappedWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }
        return trappedWater;
    }
    // Optional: for manual testing
    public static void main(String[] args) {
        TrappingRainWater solver = new TrappingRainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(solver.trap(height)); // Expected: 6
    }
}

