package org.example.productservice.controllers;

import org.example.productservice.models.Product;
import org.example.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    @Autowired // This is constructor injection
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id) {
        return productService.getSingleProduct(id);
    }
    @GetMapping()
    public List<Product> getAllProduct() {
        return productService.getAllProducts();
    }
    @PostMapping()
    public Product addNewProduct(@RequestBody Product product) {
        Product p = new Product();
        p.setTitle("This is a new product");
        return p;
    }
    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id,
                                 @RequestBody Product product) {
        return new Product();
    }
    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id,
                                  @RequestBody Product product) {
        return new Product();
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        return;
    }
}
