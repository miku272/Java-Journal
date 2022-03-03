/*
Write a program which accepts starting character and ending character. Display one by one, character from starting character till the ending character at the interval of one second using thread.
*/

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting character: ");
        char startChar = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Enter the ending character: ");
        char endChar = sc.next().charAt(0);
        sc.nextLine();

        if(startChar > endChar) {
            for(char i = startChar; i >= endChar; i--) {
                System.out.println("i = " + i);
    
                Thread.sleep(1000);
            }
        }
        else {
            for(char i = startChar; i <= endChar; i++) {
                System.out.println("i = " + i);
    
                Thread.sleep(1000);
            }
        }
        sc.close();
    }
}