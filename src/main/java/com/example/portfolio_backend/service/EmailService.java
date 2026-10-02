package com.example.portfolio_backend.service;

import com.example.portfolio_backend.dto.ContactRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;

    public void sendContactNotification(ContactRequest request){

        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setTo("saloniwarang20@gmail.com");
        mail.setSubject("Portfolio Contact Message");
        mail.setText(
                "Name: "+request.name() +
                "\nEmail: "+request.email() +
                "\nMessage: "+request.message()
        );

        mailSender.send(mail);
    }
}
