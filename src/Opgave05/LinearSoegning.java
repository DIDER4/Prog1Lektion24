package Opgave05;

public class LinearSoegning {
    public static int integerSquareRootLinear(int n) {
        int r = 0;

        // Start fra 0 og forøg r indtil r^2 > n
        while (r * r <= n) {
            r++;
        }

        // Returner r - 1, da vi går et trin for langt
        return r - 1;
    }

    public static void main(String[] args) {
        System.out.println(integerSquareRootLinear(0));  // Output: 0
        System.out.println(integerSquareRootLinear(1));  // Output: 1
        System.out.println(integerSquareRootLinear(3));  // Output: 1
        System.out.println(integerSquareRootLinear(4));  // Output: 2
        System.out.println(integerSquareRootLinear(7));  // Output: 2
        System.out.println(integerSquareRootLinear(8));  // Output: 2
        System.out.println(integerSquareRootLinear(9));  // Output: 3
        System.out.println(integerSquareRootLinear(10)); // Output: 3
        System.out.println(integerSquareRootLinear(111)); // Output: 10
    }
}
