// BankAccount.java     Part 5: Bank Account Management
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return;
        }
        balance -= amount;
        transactionHistory.add("Withdrew: " + amount);
    }

    public void printBalance() {
        System.out.printf("Account Holder: %s, Balance: %.2f%n", accountHolder, balance);
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", "Alice");
        account1.deposit(1000);
        account1.withdraw(500);
        account1.withdraw(600); // should show insufficient funds
        account1.printBalance();
        account1.printTransactionHistory();
    }
}
