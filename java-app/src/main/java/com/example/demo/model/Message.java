package com.example.demo.model;

public class Message {

    private Long id;
    private String content;

    public Message(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}