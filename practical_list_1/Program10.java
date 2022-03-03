/*
Design a class 'MyString' having a data member of type String and add member functions to it to achieve following tasks:

1. Reverse String.
2. String in Titlecase.
3. Extract 'n' characters from the right end of the string.

Write a menu driven program to call these methods of 'MyString' class. The program should not terminate abruptly.
*/

import java.util.Scanner;

class MyString {
    private String data;

    MyString() {
        this.data = "Not Set";
    }

    MyString(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String reverseString() {
        String reversedString = "";
        char temp;

        for(int i = this.data.length() - 1; i >= 0; i--) {
            temp = data.charAt(i);
            reversedString += temp;
        }

        return reversedString;
    }

    public String titleCase() { //Took this from web (more reliable but hard to understand)
        char[] titleCaseString = data.toCharArray();

        for(int i = 0; i < titleCaseString.length; i++) {
            if(i == 0 && titleCaseString[i] !=' ' || titleCaseString[i] != ' ' && titleCaseString[i - 1] == ' ') {
                if(titleCaseString[i] >= 'a' && titleCaseString[i] <= 'z') {
                    titleCaseString[i] = (char) (titleCaseString[i] - 'a' + 'A');
                }
            }
            else if(titleCaseString[i] >= 'A' && titleCaseString[i] <= 'Z') {
                titleCaseString[i] = (char) (titleCaseString[i] + 'a' - 'A');
            }
        }
        return new String(titleCaseString);
    }

    public String myTitleCase() { //Made this myself (might be less Reliable but the positive thing is that it's relatively easy to understand and I made it myself ;-)
        char ch[] = data.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            ch[i] = Character.toLowerCase(ch[i]);

            if(i == 0 || ch[i - 1] == ' ') {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }

        return new String(ch);
    }

    public String extractString(int n) {
        String extractedString = "";
        int init = data.length() - n;
        char temp;

        if(init < 0) {
            return "Error! String length out of range. Cannot extract!";
        }
        else {
            for(int i = init; i < data.length(); i++) {
                temp = data.charAt(i);
                extractedString += temp;
            }

            return extractedString;
        }
    }
}

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyString str = new MyString("Computer");
        int options;
        char continuee;

        do {
            System.out.print("\033[H\033[2J"); //For clearing the console
            System.out.flush(); //For flushing anything left after System.out.print

            System.out.print("1. Enter a string (Current string is '" + str.getData() + "').\n2. Reverse the String.\n3. String in titlecase. \n4. Extract characters from the end of the string.\n5. Exit");
            System.out.print("\nEnter your choice: ");
            options = sc.nextInt();
            sc.nextLine();

            switch (options) {
                case 1:
                    System.out.print("Enter a string: ");
                    String inp = sc.nextLine();
                    str.setData(inp);

                    System.out.println("Data entered successfully!");
                    break;
                
                case 2:
                    System.out.println("Original string: " + str.getData());
                    System.out.println("Reversed String: " + str.reverseString());

                    break;

                case 3:
                    System.out.println("Original string: " + str.getData());
                    System.out.println("Formatted (Titlecase) string: " +str.myTitleCase());

                    break;

                case 4:
                    System.out.print("Enter the number of characters you want to extract: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Original string: " + str.getData());
                    System.out.println("Extracted String: " + str.extractString(n));

                    break;

                case 5:
                    System.exit(0);
                
                default:
                    System.out.println("Invalid option! Please choose the options from one to four!");
                    break;
            }

            System.out.print("\nDo you want to continue? (press and enter'Y' or 'y'): ");
            continuee = sc.next().charAt(0);
            sc.nextLine();
        } while (continuee == 'Y' || continuee == 'y');

        sc.close();
    }
}