package com.example.stockmanagement.productservice.service;

import com.example.stockmanagement.productservice.enums.Language;
import com.example.stockmanagement.productservice.repository.entity.Product;
import com.example.stockmanagement.productservice.request.ProductCreateRequest;
import com.example.stockmanagement.productservice.request.ProductUpdateRequest;

import java.util.List;

public class ProductRepositoryService implements IProductRepositoryService{
    @Override
    public Product createProduct(Language language, ProductCreateRequest productCreateRequest) {
        return null;
    }

    @Override
    public Product getProduct(Language language, Long productId) {
        return null;
    }

    @Override
    public List<Product> getProducts(Language language) {
        return null;
    }

    @Override
    public Product updateProduct(Language language, Long productId, ProductUpdateRequest productUpdateRequest) {
        return null;
    }

    @Override
    public Product deleteProduct(Language language, Long productId) {
        return null;
    }
}
