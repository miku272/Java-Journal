/* 
Design a class to represent a bank account. Include the following members. (Using multiple constructor) :-

Data members: Name of depositer, Account number, Type of account, Balance amount in the account.

Methods: To assign initial values, To deposit an amount, To withdraw an amount after checking balance, To display the name and balance
*/

import java.util.Scanner;

class BankAccount {
    private String name, accType;
    private long accNo;
    private int balance;

    BankAccount() {
        this.name = "Naresh";
        this.accType = "Savings";
        this.accNo = 7465894123L;
        this.balance = 100000;
    }

    BankAccount(String name, String accType, long accNo, int balance) {
        this.name = name;
        this.accType = accType;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void setData(String name, String accType, long accNo, int balance) {
        this.name = name;
        this.accType = accType;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void getData() {
        System.out.println("Account details:\n");
        System.out.println("Name of the account holder:\t" + name);
        System.out.println("Account type:\t" + accType);
        System.out.println("Account number:\t" + accNo);
        System.out.println("Total balance:\t" + balance);
    }

    public int depositAmount(int amount) {
        balance += amount;

        return balance;
    }

    public int withdrawAmount(int amount) {
        if (amount > balance) {
            return -1;
        }
        else {
            balance -= amount;
            return balance;
        }

    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount("Naresh Sharma", "Savings", 1200078545, 10000);
        int options;
        char continuee;

        do {
            System.out.println("\n1. Enter account details.\n2. Deposit amount.\n3. Withdraw amount\n4. Display account details\n5. Exit.\n");
            System.out.print("Choose an option: ");
            options = sc.nextInt();
            sc.nextLine();

            switch (options) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter account type: ");
                    String accType = sc.nextLine();

                    System.out.print("Enter account number: ");
                    long accNo = sc.nextLong();

                    System.out.print("Enter balance: ");
                    int balance = sc.nextInt();
                    sc.nextLine();

                    acc.setData(name, accType, accNo, balance);

                    System.out.println("Data entered successfully!");
                    
                    break;
                case 2:
                    System.out.print("Enter the amount you want to deposit: ");
                    int dipositAmount = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Success! " + dipositAmount + " deposited! Total balance: " + acc.depositAmount(dipositAmount));

                    break;

                case 3:
                    System.out.print("Enter the amount you want to withdraw: ");
                    int withdrawlAmount = sc.nextInt();
                    sc.nextLine();
                    int totalBal = acc.withdrawAmount(withdrawlAmount);

                    if(totalBal == -1) {
                        System.out.println("Withdrawl amount exceeds account balance!");
                    }
                    else {
                        System.out.println("Success! " + withdrawlAmount + " withdrawn! Total balance: " + totalBal); 
                    }

                    break;

                case 4:
                    acc.getData();

                    break;

                case 5:
                    System.exit(0);

                default:
                System.out.println("Invalid option! Please choose any option from 1 to 5!");

                    break;
            }
            

            System.out.print("\nDo you want to continue? (Press and enter 'Y' or 'y'): ");
            continuee = sc.next().charAt(0);
            sc.nextLine();
        } while (continuee == 'Y' || continuee == 'y');

        sc.close();
    }
}
