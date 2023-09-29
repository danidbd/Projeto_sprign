package com.example.projeto1.services;

import com.example.projeto1.entities.Order;
import com.example.projeto1.entities.User;
import com.example.projeto1.repositories.OrderRepository;
import com.example.projeto1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order>  findAll(){
        return repository.findAll();
    }

    public  Order findById (Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
