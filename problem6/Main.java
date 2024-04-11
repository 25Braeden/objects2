package problem6;
import java.math.BigDecimal;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        BigDecimal interestRate = BigDecimal.valueOf(0.05); BigDecimal overdraftLimit = BigDecimal.valueOf(1000);
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        SavingsAccount savingsAccount = new SavingsAccount(interestRate);
        CheckingAccount checkingAccount = new CheckingAccount(overdraftLimit);

        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("""
                    Choose an option:
                    1 to add money to balance
                    2 to check balance
                    3 to view account number
                    4 to withdraw money
                    5 to transfer money to savings
                    6 to transfer money to checking
                    7 to withdraw money from savings
                    8 to withdraw money from checking
                    9 to view composite balance (savings + checking + unallocated)
                    10 to see overdraft limit
                    11 to see current interest in savings""");
            int decision = scanner.nextInt();
            switch (decision) {
                case 1:
                    System.out.println("Enter amount of money to add:");
                    bankAccount.deposit(scanner.nextBigDecimal());
                    break;
                case 2:
                    System.out.printf("Current balance is %f\n", bankAccount.getBalance());
                    break;
                case 3:
                    System.out.printf("Account number: %d\n", bankAccount.getAccountNumber());
                    break;
                case 4:
                    System.out.println("Enter amount of money to withdraw:");
                    bankAccount.withdraw(scanner.nextBigDecimal());
                    break;
                case 5:
                    System.out.println("Enter amount of money to transfer to savings:");
                    bankAccount.transferToSavings(scanner.nextBigDecimal());
                    break;
                case 6:
                    System.out.println("Enter amount of money to transfer to checking:");
                    bankAccount.transferToChecking(scanner.nextBigDecimal());
                    break;
                case 7:
                    System.out.println("Enter amount of money to withdraw from savings:");
                    savingsAccount.withdraw(scanner.nextBigDecimal());
                    break;
                case 8:
                    System.out.println("Enter amount of money to withdraw from checking");
                    checkingAccount.withdraw(scanner.nextBigDecimal());
                    break;
                case 9:
                    BigDecimal compositeBalance = bankAccount.getBalance().add(savingsAccount.getSavingsBalance().add(checkingAccount.getCheckingBalance()));
                    System.out.printf("Composite balance is %f\n", compositeBalance);
                    break;
                case 10:
                    System.out.printf("Your overdraft limit is %f\n", checkingAccount.getOverdraftLimit());
                    break;
                case 11:
                    System.out.printf("Your current interest rate is %f\n", interestRate);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println("Would you like to pick another option? 1 for yes 2 for no: ");
            if(scanner.nextInt() == 2) {
                keepRunning = false;
            }
        }
    }
}
