public class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.0;

    // Constructor to initialize balance
    public CheckingAccount(double balance) {
        super(balance);
    }

    // Override withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            double totalAmount = amount + TRANSACTION_FEE;
            if (currentBalance >= totalAmount) {
                currentBalance -= totalAmount;
                System.out.println("Withdrew: $" + amount + " (including $1 transaction fee)");
                displayNewBalance();
            } else {
                System.out.println("Insufficient balance for this withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}
