package problem6;

import java.math.BigDecimal;
import java.util.*;

public class BankAccount {
    private final int accountNumber;
    private BigDecimal balance;
    private SavingsAccount savingsAccount;
    private CheckingAccount checkingAccount;
    private final Random random = new Random();

    public BankAccount() {
        accountNumber = generateAccountNumber();
        balance = BigDecimal.ZERO;
        BigDecimal interestRate = BigDecimal.valueOf(0.05);
        savingsAccount = new SavingsAccount(interestRate);
        BigDecimal overdraftLimit = BigDecimal.valueOf(1000);
        checkingAccount = new CheckingAccount(overdraftLimit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(balance) > 0) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance = balance.subtract(amount);
    }

    public void transferToSavings(BigDecimal amount) {
        withdraw(amount);
        savingsAccount.deposit(amount);
    }

    public void transferToChecking(BigDecimal amount) {
        withdraw(amount);
        checkingAccount.deposit(amount);
    }

    public void transferFromSavings(BigDecimal amount) {
        savingsAccount.withdraw(amount);
        deposit(amount);
    }

    public void transferFromChecking(BigDecimal amount) {
        checkingAccount.withdraw(amount);
        deposit(amount);
    }

    private int generateAccountNumber() {
        return random.nextInt(9999) + 1;
    }
}