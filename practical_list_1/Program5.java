/*
Write a program that accepts a number from command line and check whether it's palindrome number or not
*/

public class Program5 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]), temp = num, remainder, sum = 0;

        while (num > 0) {
            remainder = num % 10;
            sum = (sum *10) + remainder;
            num = num / 10;
        }

        if(temp == sum) {
            System.out.println("The given number is palindrome number");
        }
        else {
            System.out.println("The given number isn't palindrome number");
        }
    }
}
