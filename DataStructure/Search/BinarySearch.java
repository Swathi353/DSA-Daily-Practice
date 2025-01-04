import java.util.Scanner;

public class Binarysearch {
    public static int BinarySearch(int arr[], int key) {

        int start = 0, end = (arr.length - 1);
        // we run the loop until start=end means there is only 1 element left
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            }
            if (arr[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 20, 30, 46, 55, 80, 100, 113, 150 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key to search");
        int key = sc.nextInt();
        int index = BinarySearch(arr, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("The key is on index: " + index);
        }
    }
}
// time complexity is O(log n)
