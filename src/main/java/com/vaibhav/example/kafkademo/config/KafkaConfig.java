package com.vaibhav.example.kafkademo.config;

import com.vaibhav.example.kafkademo.service.Consumer;
import com.vaibhav.example.kafkademo.service.KafkaConsumer;
import com.vaibhav.example.kafkademo.service.KafkaProducer;
import com.vaibhav.example.kafkademo.service.Producer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Bean
    public Producer producer() {
        return new KafkaProducer();
    }

    @Bean
    public Consumer consumer() {
        return new KafkaConsumer();
    }
}
