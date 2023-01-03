package com.codeusingjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.codeusingjava.model.Person;
import com.codeusingjava.util.AppConstants;

@Service
public class ProducerService {
    @Autowired
    private KafkaTemplate<String, Person> kafkaTemplate;

    public void send(Person user) {
        System.out.println("Sending User Json Serializer : {}"+user);
        kafkaTemplate.send(AppConstants.TOPIC, user);
    }
}
