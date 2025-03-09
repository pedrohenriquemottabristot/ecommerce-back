package com.senai.ecommerce.repository;

import com.senai.ecommerce.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.ecommerce.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {}
