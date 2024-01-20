package org.example.productservice.dtos;

import lombok.Getter;
import lombok.Setter;
//This is a DTO (Data Transfer Object) class. It is used to transfer data between the client and the server.
@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private double price;
    private String Category;
    private String description;
    private String image;
}
