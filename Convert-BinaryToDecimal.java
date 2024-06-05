// java program to convert binary to decimal
import java.util.Scanner;
class BinaryToDecimal {
    // function to convert binary to decimal
    public static void convert(int binnum){
        int lastdigit=0,pow=0,decinum=0;
        // make loop true until no value left in binarynumber
        while(binnum>0){
            // taking last digit
            lastdigit=binnum%10;
            // adding previous value and lastdigit * 2 to power++
            decinum=decinum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            // removing last digit
            binnum=binnum/10;
        }
        System.out.println("Decimal number is"+decinum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // user input
        System.out.println("Enter binary number");
        int bin=sc.nextInt();
        // pass value to function
        convert(bin);  
    }
}
