package com.example.demo.service;

import com.example.demo.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    private final List<Message> messages = new ArrayList<>();

    public MessageService() {
        messages.add(new Message(1L, "Hello from AWS EKS"));
        messages.add(new Message(2L, "Secure DevSecOps Pipeline"));
    }

    public List<Message> getAllMessages() {
        return messages;
    }
}