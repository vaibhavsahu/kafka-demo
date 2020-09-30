package com.vaibhav.example.kafkademo.controller;


import com.vaibhav.example.kafkademo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private Producer producer;

    @GetMapping(path = "/sendMessage/{message}")
    public void produceMessage(@PathVariable String message){
        producer.sendMessage(message);
    }

}
