package com.coursespring.mspayroll.services;

import com.coursespring.mspayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Steve", 200.0, days);
    }
}
