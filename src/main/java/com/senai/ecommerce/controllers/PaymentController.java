package com.senai.ecommerce.controllers;

import com.senai.ecommerce.dtos.PaymentDTO;
import com.senai.ecommerce.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public ResponseEntity<List<PaymentDTO>> getAllPayment() {
        List<PaymentDTO> list = paymentService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PaymentDTO> getPaymentById(@PathVariable Long id) {
        PaymentDTO paymentDTO = paymentService.findById(id);
        return ResponseEntity.ok(paymentDTO);
    }

    @PostMapping
    public ResponseEntity<PaymentDTO> createPayment(@RequestBody PaymentDTO paymentDTO) {
        PaymentDTO payment = paymentService.create(paymentDTO);
        return ResponseEntity.ok(payment);
        // "moment":"2025-02-28T21:00:00" é o formato que o Spring vai usar para a data e hora
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PaymentDTO> updatePayment(@PathVariable Long id,
                                                    @RequestBody PaymentDTO
                                                            paymentDTO) {
        PaymentDTO payment = paymentService.update(id, paymentDTO);
        return ResponseEntity.ok(payment);
    }


}
