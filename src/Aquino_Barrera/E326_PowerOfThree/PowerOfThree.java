package Aquino_Barrera.E326_PowerOfThree;

public class PowerOfThree {
     public static void main(String[] args) {
        int n = 27;
        boolean isPowerOfThree = false;

        if (n > 0) {
            while (n % 3 == 0) {
                n /= 3;
            }
            isPowerOfThree = (n == 1);
        }

        System.out.println(isPowerOfThree);
    }

}
