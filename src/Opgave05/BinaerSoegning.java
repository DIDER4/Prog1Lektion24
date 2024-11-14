package Opgave05;

public class BinaerSoegning {
    public static int integerSquareRootBinary(int n) {
        if (n < 2) return n; // For 0 og 1 er kvadratroden den samme

        int index = 0;
        int left = n;
        int right = 0;

        while (index <= left) {
            int middle = index + (left - index) / 2;

            int midKvadratRod = (int) middle * middle;

            if (midKvadratRod == n) {
                return middle;
            } else if (midKvadratRod < n) {
                right = middle;
                index = middle + 1;
            } else {
                left = middle - 1;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        System.out.println(integerSquareRootBinary(0));
        System.out.println(integerSquareRootBinary(1));
        System.out.println(integerSquareRootBinary(3));
        System.out.println(integerSquareRootBinary(4));
        System.out.println(integerSquareRootBinary(7));
        System.out.println(integerSquareRootBinary(8));
        System.out.println(integerSquareRootBinary(9));
        System.out.println(integerSquareRootBinary(10));
        System.out.println(integerSquareRootBinary(111));
    }
}
