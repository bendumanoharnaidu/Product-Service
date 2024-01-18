package org.example.productservice;

import org.example.productservice.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductserviceApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProductserviceApplication.class, args);

        Product p = new Product();
        p.getId();
        p.setId(123L);
    }
}
