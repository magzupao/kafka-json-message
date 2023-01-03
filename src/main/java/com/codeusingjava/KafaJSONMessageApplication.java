package com.codeusingjava;

import com.codeusingjava.controller.ProducerController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.codeusingjava.model.Person;
import com.codeusingjava.util.AppConstants;

@SpringBootApplication
public class KafaJSONMessageApplication {

    private static final Logger logger = LoggerFactory.getLogger(KafaJSONMessageApplication.class);
	public static void main(String[] args) {
        SpringApplication.run(KafaJSONMessageApplication.class, args);
    }

/*	@KafkaListener(topics = AppConstants.TOPIC, groupId=AppConstants.GROUP_ID, containerFactory = "kafkaListenerContainerFactory")
    public void listen(Person user) {
        logger.info("Received info--> : ", user);
        logger.info("Received info ************************** --> : ", user.getName() );
    } */
}
