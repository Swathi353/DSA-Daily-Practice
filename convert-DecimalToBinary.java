// java program to convert decimal to binary
import java.util.Scanner;
class DecimalToBinary {
    // function to convert decimal to binary
    public static void convert(int decinum){
            int n=decinum;
            int pow=0,rem=0,binnum=0;
            // run loop until nothing left in decimal
            while(decinum>0){
                // taking remainder
                rem=decinum%2;
                // placing binaries in different 10's positions
                binnum=binnum+(rem*(int)Math.pow(10,pow));
                pow++;
                // taking questiont by keep dividing by 2 everytime
                decinum=decinum/2;
            }
            System.out.println("Binary number of "+n+" is " +binnum);
           }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // user input
        System.out.println("Enter decimal number");
        int deci=sc.nextInt();
        // pass value to function
        convert(deci);  
    }
}
