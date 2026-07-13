package com.mirza.ecom.customer;

/**
 * CustomerResponse
 */
public record CustomerResponse(
        String id,
        String firstName,
        String lastName,
        String email) {
}
