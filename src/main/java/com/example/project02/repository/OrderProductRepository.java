package com.example.project02.repository;

import com.example.project02.entity.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
    List<OrderProduct> findOrderProcudtsByUserId(int userId);
    List<OrderProduct> findAll();
    OrderProduct findOrderItemById(int orderProductId);
    List<OrderProduct> findByCategory(String category);
}
