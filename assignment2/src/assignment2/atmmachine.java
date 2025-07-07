package assignment2;
import java.util.Scanner;

public class atmmachine
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 10000.00; // Initial balance
        int choice;
        
        System.out.println("----- Welcome to Simple ATM -----");

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("₹" + deposit + " deposited successfully.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("₹" + withdraw + " withdrawn successfully.");
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}