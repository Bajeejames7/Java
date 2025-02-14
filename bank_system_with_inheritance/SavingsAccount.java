public class SavingsAccount extends BankAccount {

    // Constructor to initialize balance
    public SavingsAccount(double balance) {
        super(balance);
    }

    // Override withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (currentBalance - amount >= 100) {
                currentBalance -= amount;
                System.out.println("Withdrew: $" + amount);
                displayNewBalance();
            } else {
                System.out.println("Insufficient balance. Must maintain at least $100 after withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}
