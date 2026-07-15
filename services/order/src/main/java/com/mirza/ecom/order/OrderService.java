package com.mirza.ecom.order;

import org.springframework.stereotype.Service;

import com.mirza.ecom.customer.CustomerClient;
import com.mirza.ecom.exception.BusinessException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final CustomerClient customerClient;

    public Integer createOrder(OrderRequest request) {
        var customer = this.customerClient.findCustomerById(request.customerId())
                .orElseThrow(
                        () -> new BusinessException("Cannot create order:: No customer exist with the provided id"));

        // purchase product using product microservice

        // persist order

        // persist order lines

        // start payment process

        // send order confirmation to notification microservice (kafka)

        return null;
    }

}
