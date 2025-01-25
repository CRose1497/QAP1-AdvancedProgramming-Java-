// Account.java.
package Problem1;
public class Account {
    private String id; // Account ID.
    private String name; // Account holder's name.
    private int balance = 0; // Account balance, starts at 0 by default.

    // Constructor with just id and name.
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor with id, name, and starting balance.
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Get the account ID.
    public String getID() {
        return id;
    }

    // Get the account holder's name.
    public String getName() {
        return name;
    }

    // Get the current balance.
    public int getBalance() {
        return balance;
    }

    // Add money to the account.
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Withdraw money if there’s enough balance.
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Transfer money to another account if there’s enough balance.
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount); // Subtract from this account.
            another.credit(amount); // Add to the other account.
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Show account details as a string.
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
