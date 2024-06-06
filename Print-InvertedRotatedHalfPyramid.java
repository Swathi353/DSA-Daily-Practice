// program to print inverted and rotated half pyramid
class InvertedRotatedHalfPyramid {
    // function to print inverted and rotated half pyramid
    public static void invertedRotatedHalfPyramid(int rows){
        // run loop for number of rows
        for(int i=1;i<=rows;i++){
            // spaces are equal to totalrows-current row number
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            // stars are equal to current row number
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // for new line
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        invertedRotatedHalfPyramid(4);
    }
}
// Output    
//    *
//   **
//  ***
// ****
