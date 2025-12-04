package com.task11.product_catalog.repository;

import com.task11.product_catalog.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // fetch all products of a specific category
    List<Product> findByCategory(String category);
}
