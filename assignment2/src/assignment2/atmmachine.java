package assignment2;

public class atmmachine {

	public static void main(String[] args) {
		
		double balance = 10000.0;

        if (args.length < 1) {
            System.out.println("Please provide an option: 1-Withdraw, 2-Deposit, 3-Balance Check, 4-Exit");
            return;
        }

        int choice = Integer.parseInt(args[0]);

        switch (choice) {
            case 1:
                if (args.length < 2) {
                    System.out.println("Please provide withdrawal amount.");
                    return;
                }
                double withdrawAmount = Double.parseDouble(args[1]);
                if (withdrawAmount > 0 && withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal successful! New balance: ₹" + balance);
                } else {
                    System.out.println("Insufficient balance or invalid amount.");
                }
                break;

            case 2:
                if (args.length < 2) {
                    System.out.println("Please provide deposit amount.");
                    return;
                }
                double depositAmount = Double.parseDouble(args[1]);
                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.println("Deposit successful! New balance: ₹" + balance);
                } else {
                    System.out.println("Invalid deposit amount.");
                }
                break;

            case 3:
                System.out.println("Your current balance is: ₹" + balance);
                break;

            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;

            default:
                System.out.println("Invalid choice. Please choose between 1-4.");
        }
}
}