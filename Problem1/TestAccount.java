// TestAccount.java
package Problem1;
public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts with initial balances.
        Account acc1 = new Account("A001", "John Doe", 5000);
        Account acc2 = new Account("A002", "Jane Doe", 4000);

        // Show the initial balances.
        System.out.println("Initial Balances:");
        System.out.println("Account 1: " + acc1.getBalance());
        System.out.println("Account 2: " + acc2.getBalance());

        // Transfer $1000 from Account 1 to Account 2.
        System.out.println("\nTransferring $1000 from Account 1 to Account 2...");
        acc1.transferTo(acc2, 1000);

        // Show the balances after the transfer.
        System.out.println("\nBalances After Transfer:");
        System.out.println("Account 1: " + acc1.getBalance());
        System.out.println("Account 2: " + acc2.getBalance());
    }
}
