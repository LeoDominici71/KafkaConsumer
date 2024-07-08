package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "test-topic")
    public void consume(String message) {
        // Process the Kafka message
        System.out.println("Received message: " + message);
    }
}
