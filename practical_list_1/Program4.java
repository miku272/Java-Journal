/*
Write a program that will accept two strings from command line and create overloaded methods that add these two numbers or concatinate two strings
*/

public class Program4 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + " " + b;
    }
    public static void main(String[] args) {
        String argS1;
        String argS2;
        int argI1;
        int argI2;

        try {
            argI1 = Integer.parseInt(args[0]);
            argI2 = Integer.parseInt(args[1]);

            System.out.println("The addition of two numbers are: " + add(argI1, argI2));
        }
        catch(Exception e) {
            argS1 = args[0];
            argS2 = args[1];

            System.out.println("The concatination of two Strings are: " + add(argS1, argS2));
        }
    }
    
}
