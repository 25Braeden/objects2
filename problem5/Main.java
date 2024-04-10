package problem5;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set balance: ");
        account.setBalance(scanner.nextInt());
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Would you like to:\nDeposit (1)\nWithdraw (2)\nGetbalance (3)");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter amount to be deposited: ");
                    account.deposit(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Enter amount to be withdrawn: ");
                    account.withdraw(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Your balance is: " + account.getBalance());
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println("Would you like to continue? (Y/N)");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("n")) {
                keepGoing = false;
            }
        }
    }
}