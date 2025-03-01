package com.senai.ecommerce.service;

import com.senai.ecommerce.dtos.PaymentDTO;
import com.senai.ecommerce.entities.Payment;
import com.senai.ecommerce.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public List<PaymentDTO> findAll() {
        List<Payment> payments = paymentRepository.findAll();
        return payments.stream().map(payment -> new PaymentDTO(payment.getId(), payment.getMoment())).toList();
    }

    public PaymentDTO findById(Long id) {
        Payment payment = paymentRepository.findById(id).orElseThrow();
        return new PaymentDTO(payment.getId(), payment.getMoment());
    }

    public PaymentDTO create(PaymentDTO paymentDTO) {
        Payment payment = new Payment();
        payment.setMoment(paymentDTO.getMoment());
        Payment savedPayment = paymentRepository.save(payment);
        return new PaymentDTO(savedPayment.getId(), savedPayment.getMoment());
    }

    public PaymentDTO update(Long id, PaymentDTO paymentDTO) {
        Payment payment = paymentDTOToPayment(paymentDTO);
        payment.setId(id);
        payment = paymentRepository.save(payment);
        return new PaymentDTO(payment.getId(), payment.getMoment());
    }

    private Payment paymentDTOToPayment(PaymentDTO paymentDTO) {
        Payment payment = new Payment();
        payment.setMoment(paymentDTO.getMoment());
        return payment;
    }
}
