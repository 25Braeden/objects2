package problem6;

import java.math.BigDecimal;

public class CheckingAccount {
    private BigDecimal checkingBalance;
    private BigDecimal overdraftLimit;

    public CheckingAccount(BigDecimal overdraftLimit) {
        this.checkingBalance = BigDecimal.ZERO;
        this.overdraftLimit = overdraftLimit;
    }

    public BigDecimal getOverdraftLimit() {return overdraftLimit;}

    public BigDecimal getCheckingBalance() {
        return checkingBalance;
    }

    public void setOverdraftLimit(BigDecimal overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(BigDecimal amount) {
        checkingBalance = checkingBalance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        BigDecimal overdraftAmount = checkingBalance.subtract(amount);
        if (overdraftAmount.compareTo(overdraftLimit) < 0) {
            throw new InsufficientFundsException("Exceeds overdraft limit");
        }
        checkingBalance = overdraftAmount;
    }
}