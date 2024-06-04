// java program to check if number is prime or not
import java.util.Scanner;
class HelloWorld {
    // function to check prime or not
    public static boolean isPrime(int num){
        int n=num;
        // corner case (2 will be always prime)
        if(n==2){
            return true;
        }
        // check if number divisible by any number between 2 to n-1 and if divisble then not prime
        for(int i=2;i<=(n-1);i++){
            if(n%i==0){
                return false;
            }
        }
        // else it will be prime
        return true;
    }
    // main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        // take user input
        boolean Prime=isPrime(num);
        // catch returned boolean value to check if prime or not
        if(Prime)
        System.out.println("Prime number");
        else
        System.out.println("Not Prime");
    }
}
