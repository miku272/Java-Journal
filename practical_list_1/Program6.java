/*
Write a program that accepts a string from command line and arrange all the characters in alphabetical order.

E.g - input: computer
      output: cemoprtu
*/

public class Program6 {

    public static char[] sortString(char[] input){
        char temp;
        int j = 0;
        boolean isSwapped = true;

        while(isSwapped) {
            isSwapped = false;
            j++;

            for(int i = 0; i < input.length - j; i++) {
                if(input[i + 1] < input[i]) {
                    temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    
                    isSwapped = true;
                }
            }
        }

        return input;
    }
    public static void main(String[] args) {
        char[] input = args[0].toCharArray();

        System.out.print("Input before sorting: ");
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
        System.out.print("\n");

        char[] sortedInput = sortString(input);

        System.out.print("Input after sorting: ");
        for(int i = 0; i < sortedInput.length; i++) {
            System.out.print(sortedInput[i]);
        }
    }
}
