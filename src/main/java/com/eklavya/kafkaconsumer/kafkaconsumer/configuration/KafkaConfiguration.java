package com.eklavya.kafkaconsumer.kafkaconsumer.configuration;

import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.Map;


@EnableKafka
@Configuration
public class KafkaConfiguration {

//    @Bean
//    public ConsumerFactory<String,String> consumerFactory1(){
//
//        Map<String,Object> config= new HashMap<>();
//        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");
//        config.put(ConsumerConfig.GROUP_ID_CONFIG,"group_id");
//        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
//
//
//        return new DefaultKafkaConsumerFactory<>(config);
//
//    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String,String>  concurrentKafkaListenerContainerFactory(){
//        ConcurrentKafkaListenerContainerFactory<String,String> factory=new ConcurrentKafkaListenerContainerFactory();
//        factory.setConsumerFactory(consumerFactory1());
//        return  factory;
//
//
//    }
//}
}