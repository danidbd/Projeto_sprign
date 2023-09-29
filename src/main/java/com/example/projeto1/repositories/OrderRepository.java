package com.example.projeto1.repositories;

import com.example.projeto1.entities.Order;
import com.example.projeto1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
