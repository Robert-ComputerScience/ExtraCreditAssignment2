public class Main {
    public static double findRatio(int[] array) {

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : array) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
                if (num > max1) {
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max2 = num;
                }
            }
        }

        double minSum = (double) (min1 + min2);
        double maxSum = (double) (max1 + max2);

        return maxSum / minSum;
    }

    public static void main(String[] args) {

        int[] a = {3, 5, 12, 450, 1, 1, 5, 6, 23, 6, 8, 9, 321, 2, 3};

        double ratio = findRatio(a);
        System.out.println(ratio);


    }
}