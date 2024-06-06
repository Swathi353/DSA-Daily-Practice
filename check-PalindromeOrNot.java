// program to check if number is plaindrome or not
import java.util.Scanner;
class IsPalindrome {
    // function to check palindrome or not
    public static void isPalindrome(int num){
        int n=num;
        int ld=0,rev=0;
        // run loop until no value left in num
        // function to reverse the number
        while(num!=0){
            ld=num%10;
            rev=(rev*10)+ld;
            num=num/10;
        }
        // checking if number and reverse of number are same or not
        if(rev==n){
            System.out.println("It is Palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
    }
    public static void main(String[] args) {
        // user input
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int var=sc.nextInt();
        // pass value to function
        isPalindrome(var);
        
    }
}
