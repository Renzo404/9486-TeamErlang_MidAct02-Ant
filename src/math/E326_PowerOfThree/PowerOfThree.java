package math.E326_PowerOfThree;
/**
 * <h1>Power of Three</h1>
 * The {@code PowerOfThree} class provides a method to determine whether
 * a given integer is a power of three.
 * <p>
 * This is based on LeetCode problem 326: "Power of Three".
 * </p>
 *
 * <p><b>Example:</b></p>
 * <pre>
 * Input: 27
 * Output: true
 * </pre>
 *
 * <p><b>Usage:</b></p>
 * <pre>
 * PowerOfThree solver = new PowerOfThree();
 * boolean result = solver.isPowerOfThree(27);
 * </pre>
 *
 * @author Aquino
 * @version 1.0
 */
public class PowerOfThree {
    /**
     * Determines whether a given integer {@code n} is a power of three.
     *
     * @param n the integer to check
     * @return {@code true} if {@code n} is a power of three, otherwise {@code false}
     */
       public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
