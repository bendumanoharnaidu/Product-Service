package org.example.productservice.services;

import org.example.productservice.dtos.FakeStoreProductDto;
import org.example.productservice.models.Category;
import org.example.productservice.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class FakeStoreProductService implements ProductService{
    private RestTemplate restTemplate;
    @Autowired
    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private Product convertFakeStoreProductDtoToProduct(FakeStoreProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setTitle(productDto.getTitle());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setCategory(new Category());
        product.getCategory().setName(productDto.getCategory());
        return product;
    }
    @Override
    public Product getSingleProduct(Long id) {
        FakeStoreProductDto productDto =  restTemplate.getForObject(
                "https://fakestoreapi.com/products/" + id,
                FakeStoreProductDto.class
        );
        return convertFakeStoreProductDtoToProduct(productDto);
    }

}
