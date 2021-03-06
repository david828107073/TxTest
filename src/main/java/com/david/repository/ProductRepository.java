package com.david.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.david.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
