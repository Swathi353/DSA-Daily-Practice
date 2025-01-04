
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // creating an array
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        // taking input in array
        System.out.println("Enter elemenets for array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // printing array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // update values in array
        arr[1] = arr[1] + 1;
        arr[5] = 100;
        // printing updated array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
