package com.mirza.ecom.order;

import org.springframework.stereotype.Service;

import com.mirza.ecom.customer.CustomerClient;
import com.mirza.ecom.exception.BusinessException;
import com.mirza.ecom.product.ProductClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final CustomerClient customerClient;
    private final ProductClient productClient;

    public Integer createOrder(OrderRequest request) {
        var customer = this.customerClient.findCustomerById(request.customerId())
                .orElseThrow(
                        () -> new BusinessException("Cannot create order:: No customer exist with the provided id"));

        this.productClient.purchaseProducts(request.products());

        // persist order

        // persist order lines

        // start payment process

        // send order confirmation to notification microservice (kafka)

        return null;
    }

}
