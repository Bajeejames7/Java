import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double amount;

        // Create accounts with initial balances
        SavingsAccount savings = new SavingsAccount(500);
        CheckingAccount checking = new CheckingAccount(300);

        // Main menu loop
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit to Savings");
            System.out.println("2. Withdraw from Savings");
            System.out.println("3. Deposit to Checking");
            System.out.println("4. Withdraw from Checking");
            System.out.println("5. Display Balances");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount for Savings: ");
                    amount = input.nextDouble();
                    savings.deposit(amount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount for Savings: ");
                    amount = input.nextDouble();
                    savings.withdraw(amount);
                    break;

                case 3:
                    System.out.print("Enter deposit amount for Checking: ");
                    amount = input.nextDouble();
                    checking.deposit(amount);
                    break;

                case 4:
                    System.out.print("Enter withdrawal amount for Checking: ");
                    amount = input.nextDouble();
                    checking.withdraw(amount);
                    break;

                case 5:
                    System.out.println("\n--- Account Balances ---");
                    System.out.println("Savings Account:");
                    savings.displayBalance();
                    System.out.println("\nChecking Account:");
                    checking.displayBalance();
                    break;

                case 6:
                    System.out.println("Exiting... Thank you for banking with us!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 6);

        input.close();
    }
}
