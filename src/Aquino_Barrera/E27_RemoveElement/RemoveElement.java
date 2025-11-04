package Aquino_Barrera.E27_RemoveElement;

public class RemoveElement {

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
