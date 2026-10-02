package com.example.portfolio_backend.dto;

public record ContactRequest (
    String name,
    String email,
    String message
){}
