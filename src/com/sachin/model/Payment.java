package com.sachin.model;

public class Payment {
    private final int paymentId;
    private final int rideId;
    private final int userId;
    private final double amount;
    private final String paymentMethod;
    private String status;

    public Payment(int paymentId, int rideId, int userId, double amount, String paymentMethod, String status) {
        this.paymentId = paymentId;
        this.rideId = rideId;
        this.userId = userId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;

}
    public void displayPayment() {
        System.out.println("Payment ID: " + paymentId + ", Ride ID: " + rideId + ", User ID: " + userId);
        System.out.println("Amount: $" + amount + ", Payment Method: " + paymentMethod + ", Status: " + status);
    }

    public int getAmount() {
        return 0;
    }

    public int getPaymentId() {
        return 0;
    }

    public void setStatus(String Status) {
        status = Status;
    }
}