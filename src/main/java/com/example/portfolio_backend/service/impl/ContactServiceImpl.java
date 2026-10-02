package com.example.portfolio_backend.service.impl;

import com.example.portfolio_backend.dto.ContactRequest;
import com.example.portfolio_backend.service.ContactService;
import com.example.portfolio_backend.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final EmailService emailService;

    @Override
    public void sendMessage(ContactRequest request) {

        emailService.sendContactNotification(request);
    }
}
