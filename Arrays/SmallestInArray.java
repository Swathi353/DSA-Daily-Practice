public class SmallestInArray {
    public static int LargestArr(int arr[], int smallest) {
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {

        // store + infinity in smallest variable and compare it with every elememt
        int smallest = Integer.MAX_VALUE;
        int arr[] = { 28, 41, 86, 90, 224, 45, 50, 119, 36, 300, 6, 22 };
        int small = LargestArr(arr, smallest);
        System.out.println("smallest element in the array is: " + small);
    }
}
// time complexity O(n)