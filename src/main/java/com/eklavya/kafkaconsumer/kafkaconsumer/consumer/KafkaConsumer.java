package com.eklavya.kafkaconsumer.kafkaconsumer.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {


    @KafkaListener(topics = "TestTopic2", groupId = "group_id")
    public void consumer(String message){

        System.out.println("consumed  message: \n"+message);

    }

}
