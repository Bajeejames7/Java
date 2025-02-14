public abstract class BankAccount {
    protected double initialBalance;
    protected double currentBalance;

    // Constructor to initialize the initial and current balance
    public BankAccount(double balance) {
        this.initialBalance = balance;
        this.currentBalance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            System.out.println("Deposited: $" + amount);
            displayNewBalance();
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Abstract method for withdrawal
    public abstract void withdraw(double amount);

    // Method to display initial and current balance
    public void displayBalance() {
        System.out.println("Initial Balance: $" + initialBalance);
        System.out.println("Current Balance: $" + currentBalance);
    }

    // Method to display new balance after transaction
    public void displayNewBalance() {
        System.out.println("New Balance: $" + currentBalance);
    }
}
