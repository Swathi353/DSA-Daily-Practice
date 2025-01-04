// program to print all the sub Arrays within an array and Print total number of 
// subarrays and print sum of each sub array
public class PrintSubArray {
    public static void SubArray(int arr[]) {
        int totalsubarrays = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                System.out.print(" sum: " + sum);
                sum = 0;
                // since k loop at a time prints one complete sub arry for
                // once thats why we increment totalsubarray after k loop
                totalsubarrays++;
                System.out.println();
            }

            System.out.println();

        }
        System.out.println("Total Sub Arrays: " + totalsubarrays);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        SubArray(arr);
    }
}
