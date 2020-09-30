package com.vaibhav.example.kafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaProducer implements Producer {

    private static final String TOPIC_NAME = "order";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(String message) {
        this.kafkaTemplate.send(TOPIC_NAME, message);
    }
}
