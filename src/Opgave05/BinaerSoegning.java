package Opgave05;

public class BinaerSoegning {
    public static int integerSquareRootBinary(int n) {
        if (n < 2) return n; // For 0 og 1 er kvadratroden den samme

        int low = 0;
        int high = n;
        int result = 0;

        // Binær søgning mellem low og high
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // For at undgå overflow bruger vi lang datatype til mid * mid
            long midSquared = (long) mid * mid;

            if (midSquared == n) {
                return mid; // Præcis kvadratrod fundet
            } else if (midSquared < n) {
                result = mid; // mid kan være en potentiel løsning
                low = mid + 1; // Søg til højre
            } else {
                high = mid - 1; // Søg til venstre
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(integerSquareRootBinary(0));  // Output: 0
        System.out.println(integerSquareRootBinary(1));  // Output: 1
        System.out.println(integerSquareRootBinary(3));  // Output: 1
        System.out.println(integerSquareRootBinary(4));  // Output: 2
        System.out.println(integerSquareRootBinary(7));  // Output: 2
        System.out.println(integerSquareRootBinary(8));  // Output: 2
        System.out.println(integerSquareRootBinary(9));  // Output: 3
        System.out.println(integerSquareRootBinary(10)); // Output: 3
        System.out.println(integerSquareRootBinary(111)); // Output: 10
    }
}
