package Aquino_Barrera.E27_RemoveElement;

public class RemoveElement {
      public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println("New length: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
