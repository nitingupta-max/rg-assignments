//question 5

public class BankAccount {
    private double balance;
    private String accountNumber;


    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }


    public double getBalance() {
        return this.balance;
    }


    public void deposit(double amount) {
        this.balance += amount;
    }


    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }


    public String getAccountNumber() {
        return this.accountNumber;
    }
}
