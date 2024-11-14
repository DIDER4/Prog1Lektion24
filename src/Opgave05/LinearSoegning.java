package Opgave05;

public class LinearSoegning {
    public static int integerSquareRootLinear(int target) {
        int index = 0;

        while (index * index <= target) {
            index++;
        }

        return index - 1;
    }

    public static void main(String[] args) {
        System.out.println(integerSquareRootLinear(0));
        System.out.println(integerSquareRootLinear(1));
        System.out.println(integerSquareRootLinear(3));
        System.out.println(integerSquareRootLinear(4));
        System.out.println(integerSquareRootLinear(7));
        System.out.println(integerSquareRootLinear(8));
        System.out.println(integerSquareRootLinear(9));
        System.out.println(integerSquareRootLinear(10));
        System.out.println(integerSquareRootLinear(111));
    }
}
