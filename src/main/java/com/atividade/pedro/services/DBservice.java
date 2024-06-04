package com.atividade.pedro.services;

import com.atividade.pedro.models.Product;
import com.atividade.pedro.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DBservice {
    @Autowired
    private ProductRepository productRepository;
    public void instanciaDB() {
        Product product1 = new Product(null, "Relógio","Rolex", new BigDecimal(29000.2700), 2);
        Product product2 = new Product(null, "Anel","Vivara", new BigDecimal(1299.99), 2);
        Product product3 = new Product(null, "Óculos","Lacoste", new BigDecimal(290.5), 2);

        this.productRepository.save(product1);
        this.productRepository.save(product2);
        this.productRepository.save(product3);
    }
}
