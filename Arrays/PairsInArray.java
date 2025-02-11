// Prigram to Print Pairs of an Array and Total number of pairs in an array
public class PairsInArray {
    public static void PrintPairs(int arr[]) {
        int totalpairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                totalpairs++;
            }
            System.err.println();
        }
        System.out.println("Total Pairs: " + totalpairs);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        PrintPairs(arr);
    }
}
// Time Complexity O(n^2)