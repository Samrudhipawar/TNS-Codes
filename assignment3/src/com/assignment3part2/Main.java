package com.assignment3part2;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Read ticket booking details in CSV format
            String[] bookingDetails = scanner.nextLine().split(",");
            if (bookingDetails.length != 3) {
                System.out.println("Invalid input format");
                return;
            }
            
            String stageEvent = bookingDetails[0].trim();
            String customer = bookingDetails[1].trim();
            int noOfSeats = Integer.parseInt(bookingDetails[2].trim());
            
            // Create ticket booking
            TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);
            
            // Read payment mode
            int paymentMode;
            try {
                paymentMode = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice");
                return;
            }
            
            // Process payment based on mode
            switch (paymentMode) {
                case 1: // Cash payment
                    try {
                        double cashAmount = Double.parseDouble(scanner.nextLine().trim());
                        booking.makePayment(cashAmount);
                        System.out.println("Stage event:" + booking.getStageEvent());
                        System.out.println("Customer:" + booking.getCustomer());
                        System.out.println("Number of seats:" + booking.getNoOfSeats());
                        System.out.printf("Amount %.1f paid in cash\n", booking.getAmount());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount");
                    }
                    break;
                    
                case 2: // Wallet payment
                    try {
                        double walletAmount = Double.parseDouble(scanner.nextLine().trim());
                        String walletNumber = scanner.nextLine().trim();
                        booking.makePayment(walletNumber, walletAmount);
                        System.out.println("Stage event:" + booking.getStageEvent());
                        System.out.println("Customer:" + booking.getCustomer());
                        System.out.println("Number of seats:" + booking.getNoOfSeats());
                        System.out.printf("Amount %.1f paid using wallet number %s\n", 
                                         booking.getAmount(), walletNumber);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount");
                    }
                    break;
                    
                case 3: // Credit card payment
                    try {
                        String holderName = scanner.nextLine().trim();
                        double cardAmount = Double.parseDouble(scanner.nextLine().trim());
                        String cardType = scanner.nextLine().trim();
                        String ccv = scanner.nextLine().trim();
                        booking.makePayment(cardType, ccv, holderName, cardAmount);
                        System.out.println("Stage event:" + booking.getStageEvent());
                        System.out.println("Customer:" + booking.getCustomer());
                        System.out.println("Number of seats:" + booking.getNoOfSeats());
                        System.out.println("Holder name:" + holderName);
                        System.out.printf("Amount %.1f paid using %s card\n", 
                                         booking.getAmount(), cardType);
                        System.out.println("CCV:" + ccv);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount");
                    }
                    break;
                    
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } finally {
            scanner.close();
        }
    }
}

class TicketBooking {
    // Private attributes
    private String stageEvent;
    private String customer;
    private int noOfSeats;
    private double amount;

    // Constructors
    public TicketBooking() {
    }

    public TicketBooking(String stageEvent, String customer, int noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Overloaded payment methods
    public void makePayment(Double amount) {
        this.amount = amount;
    }

    public void makePayment(String walletNumber, Double amount) {
        this.amount = amount;
    }

    public void makePayment(String creditCard, String ccv, String name, Double amount) {
        this.amount = amount;
    }
}