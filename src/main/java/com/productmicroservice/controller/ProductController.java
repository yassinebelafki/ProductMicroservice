package com.productmicroservice.controller;


import com.productmicroservice.dto.ProductRequest;
import com.productmicroservice.dto.ProductResponse;
import com.productmicroservice.model.Product;
import com.productmicroservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
            productService.save(productRequest);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<ProductResponse> allProducts(){
            return productService.getAllProducts();
    }



}
