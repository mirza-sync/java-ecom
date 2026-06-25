package com.mirza.ecom.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public Integer createProduct(
            ProductRequest request) {
        var product = mapper.toProduct(request);
        return repository.save(product).getId();
    }
}