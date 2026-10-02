package com.example.portfolio_backend.service;

import com.example.portfolio_backend.dto.ContactRequest;

public interface ContactService {

    default void sendMessage(ContactRequest request){}

}
