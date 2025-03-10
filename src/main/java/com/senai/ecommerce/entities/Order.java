package com.senai.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime moment;
    @Enumerated(EnumType.ORDINAL) // Salva o enum como um número (0,1,2...)
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    //cascade serve to delete the order when the user is deleted
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;

    @OneToMany(mappedBy = "id.order", fetch = FetchType.LAZY)
    private Set<OrderItem> items = new HashSet<>();

   
}
