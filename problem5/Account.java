package problem5;

public class Account {
    private int balance;

    public void setBalance(int balance) {
        this.balance = Math.max(balance, 0);
    }
    public void deposit(int amount) {
        this.balance += amount;
    }
    public void withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Successfully withdrawn " + amount + " from the account");
        } else {
            System.out.println("Insufficient balance, a $5 toll will be deducted.");
            this.balance -= 5;
            System.out.println("Balance: " + this.balance);
        }
    }
    public int getBalance() {
        return this.balance;
    }
}
