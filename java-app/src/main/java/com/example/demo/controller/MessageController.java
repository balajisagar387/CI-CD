package com.example.demo.controller;

import com.example.demo.model.Message;
import com.example.demo.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

    @GetMapping("/messages")
    public List<Message> messages() {
        return service.getAllMessages();
    }
}