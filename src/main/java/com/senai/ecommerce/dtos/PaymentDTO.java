package com.senai.ecommerce.dtos;

import com.senai.ecommerce.entities.Payment;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PaymentDTO {
    private Long id;
    private LocalDateTime moment;
    private Long orderId;

    public PaymentDTO() {
    }

    public PaymentDTO(Payment entity) {
        this.id = entity.getId();
        this.moment = entity.getMoment();
        this.orderId = entity.getOrder().getId();
    }
}
