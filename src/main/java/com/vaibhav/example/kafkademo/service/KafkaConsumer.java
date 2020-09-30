package com.vaibhav.example.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer implements Consumer {

    private static final String TOPIC_NAME = "order";

    @KafkaListener(topics = TOPIC_NAME, groupId = "test")
    @Override
    public void consume(String message) {
        System.out.println("received message from producer: "+ message);
    }
}
