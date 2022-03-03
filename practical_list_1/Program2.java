/*
Write a program to print Floyd's triangle where 'n' is command line input

1
2 3
4 5 6
7 8 9 10
....
............n
*/

public class Program2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]), num = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.print("\n");
        }
    }
}
