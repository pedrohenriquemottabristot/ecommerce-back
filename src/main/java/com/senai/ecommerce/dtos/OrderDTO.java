package com.senai.ecommerce.dtos;

import com.senai.ecommerce.entities.Order;
import com.senai.ecommerce.entities.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderDTO {
    private Long id;
    private LocalDateTime moment;
    private OrderStatus status;
    private Long userId;
    private Long client; // Alias for userId for backward compatibility
    private Long paymentId;

    public OrderDTO() {
    }

    public OrderDTO(Order entity) {
        this.id = entity.getId();
        this.moment = entity.getMoment();
        this.status = entity.getStatus();
        this.userId = entity.getUser().getId();
        this.client = this.userId; // Set client field as well
        this.paymentId = entity.getPayment() != null ? entity.getPayment().getId() : null;
    }

    // Getter and setter for client that maps to userId
    public Long getClient() {
        return this.userId;
    }

    public void setClient(Long client) {
        this.userId = client;
        this.client = client;
    }
}
