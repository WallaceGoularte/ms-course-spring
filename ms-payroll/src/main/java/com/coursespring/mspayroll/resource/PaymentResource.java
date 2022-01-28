package com.coursespring.mspayroll.resource;

import com.coursespring.mspayroll.entities.Payment;
import com.coursespring.mspayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payments")
public class PaymentResource {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable final Long workerId, @PathVariable final Integer days) {
        final Payment payment = paymentService.getPayment(workerId, days);
        return ResponseEntity.ok(payment);
    }

}
