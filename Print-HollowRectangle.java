// program to print hollow rectangle
class Hollowrectangle {
    // function to print hollow rectangle
    public static void hollowRectangle(int totrows,int totcols){
        // run loop for matrix where i is row number and j is column number
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totcols;j++){
                if(i==1||i==totrows||j==1||j==totcols){
                    // if any one condition true then print *
                    System.out.print("*");
                }
                // else print " " wherever no * printed
                else{
                    System.out.print(" ");
                }
            }
            // for new line after completing each line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRectangle(5,5);
    }
}
