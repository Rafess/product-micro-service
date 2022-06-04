package com.letscode.productmicroservice.controller;

import com.letscode.productmicroservice.dto.ProductResponse;
import com.letscode.productmicroservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("{name}")
    @ResponseStatus(code = HttpStatus.OK)
    public ProductResponse getProduct(@PathVariable String name) {
        return productService.getProduct(name);
    }
    @GetMapping("{/}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<ProductResponse> getAll() {
        return productService.getAll();
    }

}
