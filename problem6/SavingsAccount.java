package problem6;

import java.math.BigDecimal;

public class SavingsAccount {
    private BigDecimal savingsBalance;
    private BigDecimal interestRate;

    public SavingsAccount(BigDecimal interestRate) {
        this.savingsBalance = BigDecimal.ZERO;
    }

    public BigDecimal getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(BigDecimal amount) {
        savingsBalance = savingsBalance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(savingsBalance) > 0) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        savingsBalance = savingsBalance.subtract(amount);
    }
}