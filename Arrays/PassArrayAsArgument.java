// program to update values of all the elements in array by +1 
// and print all the elements in array
// Array comes under call by reference
// even if array is updated in called function and not returned still the
// updates are reflected in calling or main function
public class PassArrayAsArgument {
    public static void update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    public static void main(String args[]) {

        int arr[] = { 10, 20, 30, 40, 50, 60 };
        update(arr);
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i] + " ");
        }
    }
}
