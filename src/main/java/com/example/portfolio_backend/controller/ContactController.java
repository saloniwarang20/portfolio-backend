package com.example.portfolio_backend.controller;

import com.example.portfolio_backend.dto.ApiResponse;
import com.example.portfolio_backend.dto.ContactRequest;
import com.example.portfolio_backend.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
@CrossOrigin
public class ContactController {

    private final ContactService contactService;

    @PostMapping
    public ResponseEntity<ApiResponse> sendMessage(@RequestBody ContactRequest request){
        contactService.sendMessage(request);

        return ResponseEntity.ok(
                new ApiResponse(
                        true,
                        "Message sent successfully"
                )
        );
    }
}
