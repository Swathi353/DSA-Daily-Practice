public class LargestInArray {
    public static int LargestArr(int arr[], int largest) {
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {

        // store - infinity in largest variable and compare it with every elememt
        int largest = Integer.MIN_VALUE;
        int arr[] = { 28, 41, 86, 90, 224, 45, 50, 119, 36, 300, 6, 22 };
        int large = LargestArr(arr, largest);
        System.out.println("Largest element in the array is: " + large);
    }
}

// time complexity O(n)