package com.sachin.service;

import com.sachin.exceptionHandline.CabException;
import com.sachin.model.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {
    private final List<Payment> payments = new ArrayList<>();

    public void processPayment(Payment payment) throws CabException {
        if (payment == null || payment.getAmount() <= 0) {
            throw new CabException("Invalid payment details!");
        }
        payments.add(payment);
        System.out.println("Payment processed successfully.");
    }

    public void updatePaymentStatus(int paymentId, String newStatus) throws CabException {
        for (Payment payment : payments) {
            if (paymentId == payment.getPaymentId()) {
                payment.setStatus(newStatus);
                System.out.println("Payment status updated to: " + newStatus);
                return;
            }
        }
        throw new CabException("Payment ID not found!");
    }

    public void displayPayments() {
        if (payments.isEmpty()) {
            System.out.println("No payments available.");
            return;
        }
        for (Payment payment : payments) {
            payment.displayPayment();
        }
    }

}
