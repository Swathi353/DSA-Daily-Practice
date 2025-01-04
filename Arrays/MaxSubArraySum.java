// Program to print MAximum SubArray Sum- largest value among all the sums of subarrays
public class MaxSubArraySum {
    public static void MaxSubArraySum(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum = currsum + arr[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }

                System.out.println();
            }

        }
        System.out.println("Maximum Sum of sub array" + maxsum);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        MaxSubArraySum(arr);
    }
}
// Brute force method
// time complexity O(n^3)