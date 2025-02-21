package com.sachin.controllers;

import com.sachin.exceptionHandline.CabException;
import com.sachin.model.Payment;
import com.sachin.service.PaymentService;

public class PaymentController {
    private final PaymentService paymentService = new PaymentService();

    public void processPayment(int paymentId, int rideId, int userId, double amount, String method, String status) {
        try {
            Payment payment = new Payment(paymentId, rideId, userId, amount, method, status);
            paymentService.processPayment(payment);
        } catch (CabException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Payment processing attempt completed.");
        }
    }

    public void updatePaymentStatus(int paymentId, String newStatus) {
        try {
            paymentService.updatePaymentStatus(paymentId, newStatus);
        } catch (CabException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Payment status update attempt completed.");
        }
    }

    public void displayPayments() {
        paymentService.displayPayments();
    }
}

