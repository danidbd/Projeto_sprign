package com.example.projeto1.repository;

import com.example.projeto1.entities.OrderItem;
import com.example.projeto1.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
