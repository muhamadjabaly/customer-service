package com.demo.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}