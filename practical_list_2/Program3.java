/*
Write a java application which accepts 10 names of students and their age. Sort names and age in descending order at an interval of 1 second using thread
*/

import java.util.Scanner;

class Student {
    private String[] names = new String[10];
    private int[] age = new int[10];

    Student() {
        for (int i = 0; i < 10; i++) {
            names[i] = "Not Set";
            age[i] = 0;
        }
    }

    Student(String[] n, int[] a) {
        for (int i = 0; i < 10; i++) {
            names[i] = n[i];
            age[i] = a[i];
        }
    }

    public void setData(String[] n, int[] a) {
        for (int i = 0; i < 10; i++) {
            names[i] = n[i];
            age[i] = a[i];
        }
    }

    public void getData() {
        System.out.println("Names and age");

        for (int i = 0; i < 10; i++) {
            System.out.println(names[i] + "\t" + age[i]);
        }
    }

    public void namesDescending() throws InterruptedException {
        String tempName;
        int tempAge, j = 0;
        boolean isSwapped = true;

        System.out.println("Sorting data in descending order according to name....");
        while (isSwapped) {
            isSwapped = false;
            j++;

            for (int i = 0; i < 10 - j; i++) {
                if (names[i + 1].charAt(0) > names[i].charAt(0)) {
                    tempName = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = tempName;

                    tempAge = age[i];
                    age[i] = age[i + 1];
                    age[i + 1] = tempAge;

                    isSwapped = true;
                }
            }
            Thread.sleep(1000);
        }
    }

    public void ageDescending() throws InterruptedException {
        String tempName;
        int tempAge, j = 0;
        boolean isSwapped = true;

        System.out.println("Sorting data in descending order according to age....");
        while (isSwapped) {
            isSwapped = false;
            j++;

            for (int i = 0; i < 10 - j; i++) {
                if (age[i + 1] > age[i]) {
                    tempAge = age[i];
                    age[i] = age[i + 1];
                    age[i + 1] = tempAge;

                    tempName = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = tempName;

                    isSwapped = true;
                }
            }
            Thread.sleep(1000);
        }
    }
}

public class Program3 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String[] n = { "Jay", "Mukesh", "Jayveer", "Rajesh", "Heena", "Smit", "Sarita", "Riya", "Om", "Naresh" };
        int[] a = { 18, 15, 20, 10, 20, 25, 50, 17, 21, 21 };
        Student st = new Student(n, a);
        int options;
        char continuee;

        do {
            System.out.print("\033[H\033[2J"); // For clearing the console
            System.out.flush(); // For flushing anything left after System.out.print

            System.out.print(
                    "1. Enter names and age of 10 students\n2. Arrange the data in descending order (According to names).\n3. Arrange the data in descending order (According to age).\n4. Display data.\n5. Exit");
            System.out.print("\nEnter your choice: ");
            options = sc.nextInt();
            sc.nextLine();

            switch (options) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Enter name of student" + (i + 1) + ": ");
                        n[i] = sc.nextLine();

                        System.out.print("Enter age of student" + (i + 1) + ": ");
                        a[i] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("\n");
                    }

                    st.setData(n, a);

                    System.out.println("Data entered successfully!");

                    break;

                case 2:
                    st.namesDescending();

                    System.out.println(
                            "Data arranged in descending order accorrding to names! Run 'Dispay data' to show the data.");

                    break;

                case 3:
                    st.ageDescending();

                    System.out.println(
                            "Data arranged in descending order accorrding to ages! Run 'Dispay data' to show the data.");

                    break;

                case 4:
                    st.getData();

                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid option! Please choose options from 1 to 5!");

                    break;
            }

            System.out.print("\nDo you want to continue? (Press and enter 'Y' or 'y'): ");
            continuee = sc.next().charAt(0);
            sc.nextLine();
        } while (continuee == 'Y' || continuee == 'y');

        sc.close();
    }
}
