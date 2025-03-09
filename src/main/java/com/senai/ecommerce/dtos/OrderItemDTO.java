package com.senai.ecommerce.dtos;

import com.senai.ecommerce.entities.OrderItem;
import lombok.Data;

@Data
public class OrderItemDTO {
    private Long orderId;
    private Long productId;
    private int quantity;
    private double price;

    public OrderItemDTO() {
    }

    public OrderItemDTO(OrderItem entity) {
        this.orderId = entity.getId().getOrder().getId();
        this.productId = entity.getId().getProduct().getId();
        this.quantity = entity.getQuantity();
        this.price = entity.getPrice();
    }
}
