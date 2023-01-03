package com.codeusingjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.codeusingjava.model.Person;
import com.codeusingjava.util.AppConstants;

@SpringBootApplication
public class KafaJSONMessageApplication {

	public static void main(String[] args) {
        SpringApplication.run(KafaJSONMessageApplication.class, args);
    }

	@KafkaListener(topics = AppConstants.TOPIC, groupId=AppConstants.GROUP_ID)
    public void listen(Person user) {
        System.out.println("Received info--> : " +user);
        System.out.println("Received info ********** --> : " +user.getName() );
    }
}
