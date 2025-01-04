public class PredefinedMaxSubArraySum {
    // Program to print MAximum SubArray Sum- largest value among all the sums of
    // subarrays
    // Optimized Method
    // predefined SubArray Sum
    public static void MaxSubArraySum(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int prefix[] = new int[arr.length];
        // calculate prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.print("Maximum Sum of sub array: " + maxsum);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        MaxSubArraySum(arr);
    }
}
