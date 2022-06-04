package com.letscode.productmicroservice.dto;

import com.letscode.productmicroservice.entities.Product;
import lombok.Data;

@Data
public class ProductResponse extends ProductRequest{

    public static ProductResponse convertToResponse(Product product) {
        ProductResponse response = new ProductResponse();
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setPrice(product.getPrice());
        return response;
    }
}
