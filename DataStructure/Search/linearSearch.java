public class linearSearch {
    public static int LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 3, 8, 39, 100, 2, 45, 332, 0, 14 };
        int index = LinearSearch(arr, 332);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key found at index " + index);
        }
    }
}
// Time complexity is O(n)