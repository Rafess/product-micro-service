package com.letscode.productmicroservice.service;

import com.letscode.productmicroservice.dto.ProductResponse;
import com.letscode.productmicroservice.entities.Product;
import com.letscode.productmicroservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ProductResponse getProduct(String name) {
        Product product = productRepository.findByName(name);
        return ProductResponse.convertToResponse(product);
    }

    public List<ProductResponse> getAll() {
         List<Product> productList = productRepository.findAll();
         List<ProductResponse> responseList = new ArrayList<>();
        for (Product product: productList) {
            ProductResponse productResponse = ProductResponse.convertToResponse(product);
            responseList.add(productResponse);
        }
         return responseList;
    }
}