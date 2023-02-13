package com.example.stockmanagement.productservice.request;

import lombok.Data;

@Data
public class ProductUpdateRequest {
    private Long productId;
    private String productName;
    private int quantity;
    private Double price;
}
