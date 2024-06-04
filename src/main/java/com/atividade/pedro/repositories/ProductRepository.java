package com.atividade.pedro.repositories;

import com.atividade.pedro.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
