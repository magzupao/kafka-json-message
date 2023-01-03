package com.codeusingjava;

import com.codeusingjava.model.Person;
import com.codeusingjava.util.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = {"advice-topic"}, groupId=AppConstants.GROUP_ID, containerFactory = "kafkaListenerContainerFactory")
    public void listen(Person user) {
        logger.info("Received info--> : ", user);
        logger.info("Received info ************************** --> : ", user.getName() );
    }
}
